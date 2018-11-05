package com.springboot.dubbo.consumer;

import com.alibaba.dubbo.config.annotation.Reference;
import com.springboot.duboo.api.HelloService;
import org.springframework.stereotype.Component;

/**
 * @author xiaozefeng
 * @date 2018/10/10 下午2:31
 */
@Component
public class HelloConsumer {


    @Reference(url = "dubbo://127.0.0.1:20880")
    private HelloService helloService;

    public String sayHello(){
        return helloService.sayHello();
    }
}
