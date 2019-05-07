package com.himalaya.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.himalaya.common.dto.AppResponse;
import com.himalaya.ra.facade.user.client.SysUserClient;
import com.himalaya.user.dto.SysUserConditionDTO;
import com.himalaya.user.dto.SysUserDTO;

@RestController
public class UserController {

    @Autowired
    SysUserClient userClient;
    
    @GetMapping("/user/{id}")
    public AppResponse<SysUserDTO> getUserById(@PathVariable("id") Long id){
        AppResponse<SysUserDTO> appResponse = userClient.getUserById(id);
        return appResponse;
    }
    
    @GetMapping("/listUsers")
    public AppResponse<List<SysUserDTO>> listUsers(SysUserConditionDTO userConditionDTO){
    	AppResponse<List<SysUserDTO>> appResponse = userClient.getUserByCondition(userConditionDTO);
        return appResponse;
    }
}
