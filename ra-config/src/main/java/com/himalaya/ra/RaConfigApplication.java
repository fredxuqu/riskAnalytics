package com.himalaya.ra;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class RaEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(RaEurekaApplication.class, args);
	}
}
