package com.himalaya.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.himalaya.web.client.RAFeignClient;

@RestController
public class RAFeignController {

    @Autowired
    RAFeignClient raFeignClient;
    
    @GetMapping("/listUsersByFeign")
    public String ListUsersByFeign(){
        String result = this.raFeignClient.listUsers();
        return result;
    }
}