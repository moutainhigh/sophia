package com.yz.sophia.bsf.health.base;

import com.yz.sophia.bsf.core.util.ContextUtils;
import com.yz.sophia.bsf.core.util.LogUtils;
import com.yz.sophia.bsf.health.config.HealthProperties;
import com.yz.sophia.bsf.health.warn.WarnProvider;

/**
 * @author: chejiangyi
 * @version: 2019-07-23 18:47
 **/
public abstract class AbstractCollectTask implements AutoCloseable {
    protected int byteToMb = 1024 * 1024;
    /**
     * 上次采集的信息
     */
    private Object lastCollectInfo = null;
    /**
     * 上次运行时间
     */
    protected long lastRunTime=System.currentTimeMillis();

    /**
     * 时间间隔:秒
     */
    public abstract int getTimeSpan();

    /**
     * 开关
     */
    public abstract boolean getEnabled();

    /**
     * 描述
     */
    public abstract String getDesc();

    /**
     * 唯一命名
     * @return
     */
    public abstract String getName();


    /**
     * 报告
     */
    public Report getReport(){
        if(getTimeSpan()>0&&(System.currentTimeMillis()-lastRunTime)>getTimeSpan()*1000)
        {
            lastRunTime = System.currentTimeMillis();
            lastCollectInfo = getData();
        }
        if(lastCollectInfo == null)
        {    return null;}
        return new Report(lastCollectInfo);
    }

    public static void notifyMessage(EnumWarnType type,String subject,String content) {
        LogUtils.warn(AbstractCollectTask.class, HealthProperties.Project,"【报警】" + subject+"\r\n"+content,null);
        WarnProvider warnProvider = ContextUtils.getBean(WarnProvider.class,false);
        if(warnProvider != null)
        {
            Message message = new Message();
            message.setWarnType(type);
            message.setTitle(subject);
            message.setContent(content);
            if(type== EnumWarnType.ERROR) {
                warnProvider.notifynow(message);
            }
            else {
                warnProvider.notify(message);
            }
        }
    }


    protected Object getData(){return null;}

    @Override
    public void close() throws Exception {

    }
}
