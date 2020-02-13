package com.yz.sophia.bsf.health.filter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yz.sophia.bsf.core.common.Collector;
import com.yz.sophia.bsf.core.util.PropertyUtils;
import lombok.*;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 拦截器，统计接口内存增长
 * 
 * @author Robin.Wang
 * @date 2019-09-28
 * 
 */
public class DoubtApiInterceptor extends HandlerInterceptorAdapter {

	ThreadLocal<Long> beforeMem = new ThreadLocal<>();
	Map<String,DoubtApiInfo> statitisMap=new ConcurrentHashMap<>();
	/**
	 * 	增长内存统计阈值，默认3M
	 */
	private static final int DEFAULT_THRESHOLD		= 3*1024*1024;

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		if(!PropertyUtils.getPropertyCache("bsf.health.doubtapi.enabled",false)) {
			return true;
		}
		beforeMem.set(getJVMUsed());
		return true;
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		if(!PropertyUtils.getPropertyCache("bsf.health.doubtapi.enabled",false)) {
			return;
		}
		val data = beforeMem.get();
		beforeMem.remove();
		if(handler instanceof HandlerMethod)
		{
			HandlerMethod method = (HandlerMethod) handler;
			String methodPath = method.getBean().getClass().getName() +"."+ method.getMethod().getName();
			var url = request.getRequestURI();
			long increMem=getJVMUsed()-data;
			if(increMem>PropertyUtils.getPropertyCache("bsf.health.doubtapi.threshold",DEFAULT_THRESHOLD))
			{
				if(statitisMap.containsKey(methodPath))
				{
					val staticInfo=statitisMap.get(methodPath);
					staticInfo.uri=url;
					staticInfo.count+=1;
					staticInfo.totalIncreMem+=increMem;
					if(staticInfo.totalIncreMem<=0) {
						staticInfo.totalIncreMem= increMem;
						staticInfo.count=1;
					}
					
				} else {
					val staticInfo=new DoubtApiInfo();
					staticInfo.method=methodPath;
					staticInfo.uri=url;
					//第一次不计算内存
					staticInfo.count=0;
					staticInfo.totalIncreMem=0;
					statitisMap.put(methodPath, staticInfo);				
				}
				Collector.Default.value("bsf.doubtapi.info").set(statitisMap);
			}
		}
	}

	/**
	 * 获取JVM内存
	 */
	private long getJVMUsed() {
		Runtime rt = Runtime.getRuntime();
		return (rt.totalMemory() - rt.freeMemory());
	}

	@Data
	@NoArgsConstructor
	@AllArgsConstructor
	public static class DoubtApiInfo implements Comparable<DoubtApiInfo> {
		/**
		 * 请求URL
		 */
		private String uri;
		/**
		 * 请求接口方法
		 */
		private String method;
		/**
		 * 总增加内存
		 */
		private long totalIncreMem;
		/**
		 * 请求命中次数
		 */
		private int count;

		/**
		 * 倒序
		 * */
		@Override
		public int compareTo(DoubtApiInfo o) {			
			if(o==null)
				return -1;
			long cha= o.getCount()>0?o.getTotalIncreMem() / o.getCount(): o.getTotalIncreMem() - this.count>0?this.totalIncreMem / this.count:this.totalIncreMem;
			
			if(cha>0) {
				return 1;
			} else if(cha<0) {
				return -1;
			} else {
				return 0;
			}				
		}
	}
	

}
