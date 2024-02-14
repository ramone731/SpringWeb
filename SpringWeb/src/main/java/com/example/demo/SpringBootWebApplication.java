package com.example.demo;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication //config, enable-autoconfig, component-scan
public class SpringBootWebApplication {
    public static void main(String[] args) {

        SpringApplication.run(SpringBootWebApplication.class, args);
    }
}
