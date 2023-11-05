package com.dailycodebuffer.boot.example.component;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("qa") // We are telling spring to create bean only when QA Profile is active.
// Ideally we should avoid using this but this helps to create beans conditionally.
public class H2DBComponent implements DBComponent{
    @Override
    public void performDBOperation() {
        System.out.println("Performing H2 DB Operation");
    }
}
