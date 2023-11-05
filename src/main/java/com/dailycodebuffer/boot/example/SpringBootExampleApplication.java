package com.dailycodebuffer.boot.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
// Combination of following annotations and you realy dont had to provide all this which we provided config and component scan in prevous example
// it automatically scan and creates bean
//@Configuration
//@EnableAutoConfiguration
//@ComponentScan
public class SpringBootExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootExampleApplication.class, args);
	}


}
