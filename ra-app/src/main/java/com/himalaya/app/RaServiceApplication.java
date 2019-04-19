package com.himalaya.app;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@MapperScan("com.himalaya.app.*.mapper")
public class RaServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(RaServiceApplication.class, args);
	}
}
