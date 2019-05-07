package com.himalaya.ra.facade.user.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.himalaya.common.dto.AppResponse;
import com.himalaya.user.dto.SysUserConditionDTO;
import com.himalaya.user.dto.SysUserDTO;

import io.swagger.annotations.ApiOperation;

@FeignClient(name="${spring.application.service.name:ra-app}")
public interface SysUserClient {
	
	String USER_URL = "/user";
	
	@ApiOperation(value="get user by userId")
	@RequestMapping(value=USER_URL + "/id/{id}", method=RequestMethod.GET)
	public AppResponse<SysUserDTO> getUserById(@PathVariable("id") Long id);
	
	@ApiOperation(value="get users")
	@RequestMapping(value=USER_URL + "/getUsers", method=RequestMethod.POST)
	public AppResponse<List<SysUserDTO>> getUserByCondition(@RequestBody SysUserConditionDTO userConditionDTO);
}
