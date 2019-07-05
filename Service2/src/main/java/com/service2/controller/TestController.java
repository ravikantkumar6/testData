package com.service2.controller;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController("/")
@Api(tags = "TestController", produces = "application/json")
public class TestController {
    @GetMapping("get")
    public List<String> getData() {
        return new ArrayList<>(Arrays.asList("Service2","Test"));
    }
}
