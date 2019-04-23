package com.himalaya.ra.facade.user.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.himalaya.common.dto.PageDTO;
import com.himalaya.user.dto.UserDTO;

import io.swagger.annotations.ApiOperation;

@FeignClient(name="${RA-APP}")
public interface UserClient {
	
	String USER_URL = "/user";
	
	@ApiOperation(value="get user by userId")
	@RequestMapping(value=USER_URL + "/id/{id}", method=RequestMethod.GET)
	public UserDTO getUserById(@PathVariable("id") Long id);
	
	@ApiOperation(value="get users")
	@RequestMapping(value=USER_URL + "/getUsers", method=RequestMethod.POST)
	public PageDTO<UserDTO> getUserByCondition(@RequestBody UserDTO userDTO);
}
