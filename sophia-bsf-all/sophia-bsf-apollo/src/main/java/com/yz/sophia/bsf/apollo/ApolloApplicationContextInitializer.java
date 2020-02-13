package com.yz.sophia.bsf.apollo;

import com.ctrip.framework.apollo.Config;
import com.ctrip.framework.apollo.ConfigService;
import com.ctrip.framework.apollo.model.ConfigChange;
import com.yz.sophia.bsf.core.base.Environment;
import com.yz.sophia.bsf.core.common.PropertyCache;
import com.yz.sophia.bsf.core.config.CoreProperties;
import com.yz.sophia.bsf.core.util.ClassPoolUtils;
import com.yz.sophia.bsf.core.util.PropertyUtils;
import lombok.val;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.annotation.Order;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.util.StringUtils;

import com.google.common.base.Strings;
import com.yz.sophia.bsf.core.base.BsfEnvironmentEnum;
import com.yz.sophia.bsf.core.util.LogUtils;

import javassist.ClassPool;
import javassist.CtClass;
import javassist.CtConstructor;

import java.io.File;

/**
 * @author: chejiangyi
 * @version: 2019-05-28 12:08
 **/
@Order(-1)
public class ApolloApplicationContextInitializer implements ApplicationContextInitializer<ConfigurableApplicationContext> {

	private static boolean isload =false;
	
    @Override
    public void initialize(ConfigurableApplicationContext context) {
        ConfigurableEnvironment environment = context.getEnvironment();
        if("false".equalsIgnoreCase(environment.getProperty(CoreProperties.BsfEnabled))){
            return;
        }
        this.initializeSystemProperty(environment);
    }

    void initializeSystemProperty(ConfigurableEnvironment environment) {

        //bsf.apollo.enabled 设置为关闭则跳出
        String propertyValue = environment.getProperty(ApolloProperties.SpringApplicationName);
        if (Strings.isNullOrEmpty(propertyValue)) {
            return;
        }

        propertyValue = environment.getProperty(ApolloProperties.BsfApolloEnabled);
        if (Strings.isNullOrEmpty(propertyValue)|| "false".equalsIgnoreCase(propertyValue)) {
            {return;}
        }
        //默认设置app.id
        PropertyUtils.setDefaultInitProperty(ApolloApplicationContextInitializer.class,ApolloProperties.Project,ApolloProperties.AppId,environment.getProperty(ApolloProperties.SpringApplicationName));
        if(!StringUtils.isEmpty(System.getProperty(ApolloProperties.AppId)))
        {
            val env = environment.getProperty(ApolloProperties.BsfEnv);
            //默认设置apollo.meta
            setDefaultProperty(ApolloProperties.ApolloMeta, Environment.dev.toString().equalsIgnoreCase(env)?BsfEnvironmentEnum.APOLLO_DEV.getUrl():BsfEnvironmentEnum.APOLLO_PRD.getUrl());
            //默认设置env
            setDefaultProperty(ApolloProperties.Env,env);
            //默认设置 apollo.bootstrap.enabled=true
            setDefaultProperty(ApolloProperties.ApolloBootstrapEnabled,"true");
            //默认设置 namespaces
            setDefaultProperty(ApolloProperties.ApolloBootstrapNamespaces,"application,bsf");
            //默认设置 日志加载前后 v1.2版本+ 的客户端才生效
            setDefaultProperty(ApolloProperties.ApolloBootstrapEagerLoadEnabled,"true");
            //默认config cache 位置
            String configdir = System.getProperty(ApolloProperties.UserDir)+File.separator+"apolloConfig"+File.separator;
            setDefaultProperty(ApolloProperties.ApolloCacheDir,configdir);
            this.replaceCatInit(environment);
            this.registerConfigChangedListener(environment);
        }

    }
    
	private void replaceCatInit(ConfigurableEnvironment environment) {
		try {
			ClassPool classPool = ClassPoolUtils.getInstance();
			CtClass ctClass = classPool.get("com.ctrip.framework.apollo.tracer.internals.DefaultMessageProducerManager");
			if (!isload) {
				isload = true;
				CtConstructor[] constructors = ctClass.getConstructors();
				if(constructors!=null && constructors.length > 0) {
					CtConstructor constructor = constructors[0];
					constructor.setBody(newMethodCode());
				}
				if (ctClass.isFrozen()) {
					ctClass.defrost();
				}
				ctClass.toClass();
				LogUtils.info(ApolloApplicationContextInitializer.class,ApolloProperties.Project,"重写cat init ok");
			}
		} catch (Exception exp) {
            LogUtils.error(ApolloApplicationContextInitializer.class,ApolloProperties.Project,"重写cat init 异常", exp);
		}
	}

	private void registerConfigChangedListener(ConfigurableEnvironment environment){
        for(val namespace:environment.getProperty(ApolloProperties.ApolloBootstrapNamespaces,"").split(",")) {
            if(!StringUtils.isEmpty(namespace)) {
                Config config = ConfigService.getConfig(namespace);
                config.addChangeListener(changeEvent -> {
                    for (String key : changeEvent.changedKeys()) {
                        ConfigChange change = changeEvent.getChange(key);
                        LogUtils.info(ApolloApplicationContextInitializer.class, ApolloProperties.Project,
                                String.format("监听到apollo配置修改,key: %s, oldValue: %s, newValue: %s, changeType: %s, 当前配置值: %s",
                                        change.getPropertyName(), change.getOldValue(), change.getNewValue(), change.getChangeType(),PropertyUtils.getProperty(key)));
                        PropertyCache.Default.tryUpdateCache(change.getPropertyName(), PropertyUtils.getProperty(key));
                    }
                });
            }
        }
    }

   private String newMethodCode(){
        String code = "{" +
                "     producer = new com.ctrip.framework.apollo.tracer.internals.NullMessageProducerManager().getProducer();" +
                "}";
        return code;
    }

    void setDefaultProperty(String key,String defaultPropertyValue)
    {
        PropertyUtils.setDefaultInitProperty(ApolloApplicationContextInitializer.class,ApolloProperties.Project,key,defaultPropertyValue);
    }

}
