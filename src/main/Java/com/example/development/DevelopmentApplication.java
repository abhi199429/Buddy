package com.example.development;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan(basePackages = {"com.example.development"})
public class DevelopmentApplication {

    public static void main(String[] args) {

        SpringApplication.run(DevelopmentApplication.class, args);
    }
}
