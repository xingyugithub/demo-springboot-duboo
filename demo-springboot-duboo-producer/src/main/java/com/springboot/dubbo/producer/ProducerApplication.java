package com.springboot.dubbo.producer;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;

/**
 * @author xiaozefeng
 * @date 2018/10/10 下午2:10
 */
@MapperScan("com.springboot.dubbo.dao")
@ImportResource(locations = { "classpath:dubbo-spring.xml" })
@EnableDubboConfiguration
@SpringBootApplication
public class ProducerApplication {
	static Log loggers = LogFactory.getFactory().getInstance(ProducerApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(ProducerApplication.class, args);
		loggers.info("**************dubbo-start-finish*****************");
	}

}
