package com.trey.center;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class TreyCenterApplication {

    public static void main(String[] args) {
        SpringApplication.run(TreyCenterApplication.class, args);
    }
}