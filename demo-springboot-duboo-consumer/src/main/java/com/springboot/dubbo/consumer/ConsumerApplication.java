package com.springboot.dubbo.consumer;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xiaozefeng
 * @date 2018/10/10 下午2:15
 */
@SpringBootApplication
@EnableDubboConfiguration
@RestController
public class ConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplication.class, args);
    }

    @Autowired
    private HelloConsumer helloConsumer;


    @GetMapping("/hello")
    public String hello() {
        return helloConsumer.sayHello();
    }
}
