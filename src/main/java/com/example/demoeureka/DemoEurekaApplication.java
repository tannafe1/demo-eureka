package com.example.demoeureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoEurekaApplication.class, args);
        System.out.println("注册中心服务启动...");

    }

}
