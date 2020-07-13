package com.trey.gateway.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class GateController {
    @Value("${gateway.user.name}")
    private String username;

    @Value("${gateway.user.age}")
    private String age;

    @Value("${gateway.appName}")
    private String appName;

    @Value("${gateway.appName2}")
    private String appName2;

    @GetMapping("/get")
    public String get() {
        return "username = " + username + ", age = " + age + ", appName = " + appName + ", appName2 = " + appName2;
    }
}
