package com.himalaya.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
@EnableFeignClients(basePackages = "com.himalaya.ra.facade.*.client")
public class RaWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(RaWebApplication.class, args);
	}
	
//    @Bean
//    @LoadBalanced
//    RestTemplate restTemplate(){
//        return new RestTemplate();
//    }
}
