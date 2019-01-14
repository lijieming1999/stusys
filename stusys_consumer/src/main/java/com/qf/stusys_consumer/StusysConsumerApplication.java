package com.qf.stusys_consumer;

import com.alibaba.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@DubboComponentScan(value = "com.qf.controller")
public class StusysConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(StusysConsumerApplication.class, args);
	}

}

