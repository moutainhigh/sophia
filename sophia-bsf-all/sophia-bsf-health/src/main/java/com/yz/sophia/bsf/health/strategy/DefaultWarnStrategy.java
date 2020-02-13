package com.yz.sophia.bsf.health.strategy;

import com.yz.sophia.bsf.core.util.PropertyUtils;
import com.yz.sophia.bsf.health.base.Report;
import com.yz.sophia.bsf.health.collect.IOCollectTask;
import lombok.val;
import java.util.*;

/**
 * 默认报警策略
 * @author: chejiangyi
 * @version: 2019-07-28 08:24
 **/
public class DefaultWarnStrategy {
    public static DefaultWarnStrategy Default = new DefaultWarnStrategy(new Rule.RulesAnalyzer());
    protected static int maxCacheSize=3;
    protected static List<Report> cacheReports = Collections.synchronizedList(new ArrayList<>(maxCacheSize+2));
    protected Rule.RulesAnalyzer rulesAnalyzer;
    protected WarnTemplate warnTemplate = WarnTemplate.Default;

    public Rule.RulesAnalyzer getRulesAnalyzer() {
        return rulesAnalyzer;
    }

    public WarnTemplate getWarnTemplate() {
        return warnTemplate;
    }

    public DefaultWarnStrategy(Rule.RulesAnalyzer rulesAnalyzer) {
        this.rulesAnalyzer = rulesAnalyzer;
        this.setDefaultStrategy();
    }

    public void setDefaultStrategy(){
        this.rulesAnalyzer.registerRules("cpu.process", PropertyUtils.getPropertyCache("bsf.health.strategy.cpu.process","[>0.7]"));
        this.rulesAnalyzer.registerRules("cpu.system",PropertyUtils.getPropertyCache("bsf.health.strategy.cpu.system","[>0.7]"));
        this.rulesAnalyzer.registerRules("io.current.dir.usable.size",PropertyUtils.getPropertyCache("bsf.health.strategy.io.current.dir.usable.size","[<500]"));
        this.rulesAnalyzer.registerRules("memery.jvm.max",PropertyUtils.getPropertyCache("bsf.health.strategy.memery.jvm.max","[<256]"));
        this.rulesAnalyzer.registerRules("memery.system.free",PropertyUtils.getPropertyCache("bsf.health.strategy.memery.system.free","[<256]"));
        this.rulesAnalyzer.registerRules("thread.deadlocked.count",PropertyUtils.getPropertyCache("bsf.health.strategy.thread.deadlocked.count","[>10]"));
        this.rulesAnalyzer.registerRules("thread.total",PropertyUtils.getPropertyCache("bsf.health.strategy.thread.total","[>1000]"));
        this.rulesAnalyzer.registerRules("tomcat.threadPool.poolSize.count",PropertyUtils.getPropertyCache("bsf.health.strategy.tomcat.threadPool.poolSize.count","[>1000]"));
        this.rulesAnalyzer.registerRules("tomcat.threadPool.active.count",PropertyUtils.getPropertyCache("bsf.health.strategy.tomcat.threadPool.active.count","[>200]"));
        this.rulesAnalyzer.registerRules("tomcat.threadPool.queue.size",PropertyUtils.getPropertyCache("bsf.health.strategy.tomcat.threadPool.queue.size","[>50]"));
        if(this.rulesAnalyzer.getRules("io.current.dir.usable.size")!=null)
        {
            //设置报警回调
            this.rulesAnalyzer.getRules("io.current.dir.usable.size").forEach(c->{
                if(c.getType()== Rule.RuleType.less){
                    c.setHitCallBack((value)->IOCollectTask.clearlog());
                }
            });
        }
    }

    public Report analyse(Report report){
        while (cacheReports.size()>maxCacheSize){
            cacheReports.remove(0);
        }
        cacheReports.add(report);
        val avgReport = report.avgReport(cacheReports);
        return this.rulesAnalyzer.analyse(avgReport);
    }

    public String analyseText(Report report){
        val r = analyse(report);
        StringBuilder warn = new StringBuilder();
        r.eachReport((filed,item)->{
            if(item.isWarn())
            {
                warn.append(warnTemplate.getWarnConent(filed,item.getDesc(),item.getValue(),item.getRule()));
            }
            return item;
        });
        val warninfo = warn.toString();
        if(warninfo==null || warninfo.isEmpty())
        {    return "";}
        return warninfo;
    }





}
