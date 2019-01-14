package com.qf.stusys_provide;

import com.alibaba.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
@DubboComponentScan(value = "com.qf")
public class StusysProvideApplication {

	public static void main(String[] args) {
		SpringApplication.run(StusysProvideApplication.class, args);
	}

}