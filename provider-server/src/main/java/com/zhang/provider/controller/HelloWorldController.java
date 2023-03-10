package com.zhang.provider.controller;

import com.zhang.provider.client.HelloWorldClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloWorldController implements HelloWorldClient {

    @Override
    @RequestMapping("/sayHello")
    public String sayHello() {
        return "Hello World";
    }
}
