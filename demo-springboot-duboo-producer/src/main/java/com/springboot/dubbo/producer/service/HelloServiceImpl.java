package com.springboot.dubbo.producer.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.springboot.duboo.api.HelloService;

/**
 * @author xiaozefeng
 * @date 2018/10/10 下午2:11
 */
@Service("helloService")
@Component
public class HelloServiceImpl implements HelloService {

	@Override
	public String sayHello() {
		return "Hello Dubbo";
	}
}
