package com.yz.sophia.bsf.health.collect;

import com.yz.sophia.bsf.core.common.Collector;
import com.yz.sophia.bsf.core.util.ContextUtils;
import com.yz.sophia.bsf.core.util.PropertyUtils;
import com.yz.sophia.bsf.core.util.ReflectionUtils;
import com.yz.sophia.bsf.health.base.AbstractCollectTask;
import com.yz.sophia.bsf.health.base.FieldReport;
import lombok.Data;
import lombok.var;

/**
 * @author Huang Zhaoping
 */
public class FileCollectTask extends AbstractCollectTask {

    @Override
    public int getTimeSpan() {
        return PropertyUtils.getPropertyCache("bsf.health.file.timeSpan", 20);
    }

    @Override
    public boolean getEnabled() {
        return PropertyUtils.getPropertyCache("bsf.health.file.enabled", true);
    }

    @Override
    public String getDesc() {
        return "File服务性能采集";
    }

    @Override
    public String getName() {
        return "file.info";
    }

    @Override
    protected Object getData() {
        FileInfo data = new FileInfo();
        if (ContextUtils.getBean(ReflectionUtils.tryClassForName("com.yz.sophia.bsf.file.impl.HotFileProvider"), false) != null) {
            data.provider = "hotfile";
        } else if (ContextUtils.getBean(ReflectionUtils.tryClassForName("com.yz.sophia.bsf.file.impl.QiniuFileProvider"),false) != null) {
            data.provider = "qiniu";
        }
        if (data.provider != null) {
            var hook = (Collector.Hook)ReflectionUtils.callMethod(ReflectionUtils.classForName("com.yz.sophia.bsf.file.impl.FileProviderMonitor"), "hook", null);
            data.hookCurrent = hook.getCurrent();
            data.hookError = hook.getLastErrorPerSecond();
            data.hookSuccess = hook.getLastSuccessPerSecond();
            data.hookList = hook.getMaxTimeSpanList().toText();
            data.hookListPerMinute = hook.getMaxTimeSpanListPerMinute().toText();
        }
        return data;
    }

    @Data
    private static class FileInfo {
        @FieldReport(name = "file.provider", desc = "File服务提供者")
        private String provider;
        @FieldReport(name = "file.hook.error", desc = "File服务拦截上一次每秒出错次数")
        private Long hookError;
        @FieldReport(name = "file.hook.success", desc = "File服务拦截上一次每秒成功次数")
        private Long hookSuccess;
        @FieldReport(name = "file.hook.current", desc = "File服务拦截当前执行任务数")
        private Long hookCurrent;
        @FieldReport(name = "file.hook.list.detail", desc = "File服务拦截历史最大耗时任务列表")
        private String hookList;
        @FieldReport(name = "file.hook.list.minute.detail", desc = "File服务拦截历史最大耗时任务列表(每分钟)")
        private String hookListPerMinute;
    }
}
