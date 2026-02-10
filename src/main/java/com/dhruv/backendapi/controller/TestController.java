package com.dhruv.backendapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping("/health")
    public String health() {
        return "Application is healthy!";
    }

    @GetMapping("/hello")
    public String hello() {
        return "Hello from Elastic Beanstalk CI/CD pipeline!";
    }
}
