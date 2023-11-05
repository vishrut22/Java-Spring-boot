package com.dailycodebuffer.boot.example.component;

import org.springframework.stereotype.Component;

@Component
public class HelloWorldComponent {
    public String sayHello() {
        return "Hello World of Spring Boot!!";
    }
}
