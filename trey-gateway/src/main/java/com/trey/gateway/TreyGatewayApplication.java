package com.trey.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class TreyGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(TreyGatewayApplication.class, args);
    }

}