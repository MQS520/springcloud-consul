package com.mqs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ConsulProducer2Application {

    public static void main(String[] args) {
        SpringApplication.run(ConsulProducer2Application.class, args);
    }

}