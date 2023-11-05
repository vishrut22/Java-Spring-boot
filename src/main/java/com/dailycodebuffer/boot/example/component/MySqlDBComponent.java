package com.dailycodebuffer.boot.example.component;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("prod")
public class MySqlDBComponent implements DBComponent{
    @Override
    public void performDBOperation() {
        System.out.println("Performing DB Operation in MYSQL.");
    }
}
