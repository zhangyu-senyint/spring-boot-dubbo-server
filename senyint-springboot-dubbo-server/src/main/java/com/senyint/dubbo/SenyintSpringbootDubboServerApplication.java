package com.senyint.dubbo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.senyint.dubbo.mapper")
public class SenyintSpringbootDubboServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SenyintSpringbootDubboServerApplication.class, args);
	}
}
