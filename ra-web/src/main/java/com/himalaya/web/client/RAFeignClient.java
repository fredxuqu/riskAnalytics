package com.himalaya.web.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="RA-APP")
public interface RAFeignClient {

	@GetMapping("/ra-service/listUsers")
	public String listUsers();
}
