package com.service1.controller;

import io.swagger.annotations.Api;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController("/")
@Api(tags = "UserController", produces = "application/json")
public class UserController {

    @GetMapping("gets")
    public String getData() {
       RestTemplate restTemplate =  new RestTemplateBuilder().rootUri("http://localhost:8080").build();

        System.out.println(restTemplate.toString());
        return restTemplate.getForObject("/get",String.class);
    }
}
