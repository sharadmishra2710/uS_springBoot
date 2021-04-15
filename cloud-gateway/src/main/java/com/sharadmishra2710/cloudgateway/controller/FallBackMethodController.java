package com.sharadmishra2710.cloudgateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackMethodController {

    @GetMapping("/usersFallback")
    public String userServiceFallbackMethod(){
        return "User Service is taking longer than expected Please try again after sometime";
    }

    @GetMapping("departmentsFallback")
    public String depServiceFallbackMethod(){
        return "department Service is taking longer than expected Please try again after sometime";
    }

}
