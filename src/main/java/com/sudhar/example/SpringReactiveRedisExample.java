package com.sudhar.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.reactive.config.EnableWebFlux;

@SpringBootApplication
@EnableWebFlux
public class SpringReactiveRedisExample {

    public static void main(final String[] args) {
        SpringApplication.run(SpringReactiveRedisExample.class, args);
    }
}
