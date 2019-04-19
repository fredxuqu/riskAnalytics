package com.himalaya.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class RARobbinController {

    @Autowired
    RestTemplate restTemplate;
    
    @GetMapping("/listUsers")
    public String ListUsersByRibbon(){
        String result = this.restTemplate.getForObject("http://RA-SERVICE/ra-service/listUsers", String.class);
        return result;
    }
}
