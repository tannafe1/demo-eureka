package com.example.demoeureka.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
public class test {
    @GetMapping("/test/sayHello")
    public String sayHello() {
        return "===============hello demo-eureka==============\n";
    }
}


