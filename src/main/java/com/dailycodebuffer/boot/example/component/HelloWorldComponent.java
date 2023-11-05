package com.dailycodebuffer.boot.example.component;

import com.dailycodebuffer.boot.example.config.ConfigPrefix;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component
public class HelloWorldComponent {
    Logger logger = LoggerFactory.getLogger(HelloWorldComponent.class);

    @Value("${custom.property.message}")
    private String message;

    @Value("${custom.yaml.message}")
    private String yamlMessage;

    @Autowired
    private ConfigPrefix configPrefix;

    public String sayHello() {
        logger.debug("Debugging from Application component.");
        logger.trace("Tracing from Application component.");
        logger.info("info from Application component.");
        return message+ " of "+configPrefix.getFirstName()+" "+configPrefix.getLastName();
    }


    public String sayHelloToYaml() {

        return yamlMessage+ " of Spring Boot!!";
    }
}
