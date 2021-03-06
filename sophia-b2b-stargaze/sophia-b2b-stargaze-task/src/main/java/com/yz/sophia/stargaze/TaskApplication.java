package com.yz.sophia.stargaze;

//import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
//import com.alibaba.dubbo.spring.boot.context.event.DubboBannerApplicationListener;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
/**
 * 兼容旧dubbo使用
 */
//@EnableDubboConfiguration
/*@MapperScan(basePackages = "com.yz.sophia.stargaze.dao")
@ComponentScan(basePackages = "com.yz.sophia.stargaze")
@EnableEurekaClient
@EnableFeignClients*/
public class TaskApplication {
	public static void main(String[] args) {
		/**
		 * 兼容旧dubbo使用
		 */
		//DubboBannerApplicationListener.setBANNER_MODE(Banner.Mode.OFF);
		SpringApplication.run(TaskApplication.class, args);
	}
}
