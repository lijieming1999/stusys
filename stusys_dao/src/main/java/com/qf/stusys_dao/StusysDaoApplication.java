package com.qf.stusys_dao;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
@MapperScan(value = "com.qf.dao") //配置映射接口包扫描
public class StusysDaoApplication {

	public static void main(String[] args) {
		SpringApplication.run(StusysDaoApplication.class, args);
	}

}

