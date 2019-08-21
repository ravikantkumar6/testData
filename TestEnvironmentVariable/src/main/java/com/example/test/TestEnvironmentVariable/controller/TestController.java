package com.example.test.TestEnvironmentVariable.controller;

import com.example.test.TestEnvironmentVariable.config.ApplicationProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Autowired
    private ApplicationProperties properties;
    @GetMapping("/get")
    public String getData(){
        System.out.println(properties.getEnv() +"******************");
        return properties.getEnv();
    }
}
