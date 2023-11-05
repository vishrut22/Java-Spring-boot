package com.dailycodebuffer.boot.example.controller;

import com.dailycodebuffer.boot.example.component.HelloWorldComponent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // Rest api annotation
public class HelloRestController {

    @Autowired // Spring boot has taken care the autowiring and bean creation of helloworld component
    private HelloWorldComponent helloWorldComponent;
    @GetMapping
    public String sayHello() {
        return helloWorldComponent.sayHello();

    }
}
