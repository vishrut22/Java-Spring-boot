package com.dailycodebuffer.boot.example.component;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;


@Component
public class HelloWorldComponent {
    Logger logger = LoggerFactory.getLogger(HelloWorldComponent.class);

    public String sayHello() {
        logger.debug("Debugging from Application component.");
        logger.trace("Tracing from Application component.");
        logger.info("info from Application component.");
        return "Hello World of Spring Boot!!";
    }
}
