package com.mqs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@SpringBootApplication
public class ConsulZuulApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsulZuulApplication.class, args);
    }

}
