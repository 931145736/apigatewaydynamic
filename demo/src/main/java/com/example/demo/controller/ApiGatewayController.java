package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiGatewayController {

    @Value("${zuul.routes.service-a.path}")
    String serviceName;

    @RequestMapping("/findServiceName")
    public String findServiceName(){
        return serviceName;
    }
}
