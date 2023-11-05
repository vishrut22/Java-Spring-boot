package com.dailycodebuffer.boot.example.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

//Property wiring by prefix of config properties

@Configuration
@ConfigurationProperties(prefix = "config.prefix")
public class ConfigPrefix {
    //Automatically wired the config.prefix. to respective fields.
    private String firstName;
    private String lastName;

    public String getFirstName() {
        return firstName;
    }



    public String getLastName() {
        return lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
