package com.trey.client.controller;

import com.trey.client.feign.ServerFeignService;
import com.trey.client.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    private TestService service;

    @Autowired
    private ServerFeignService serverFeignService;

    @GetMapping(value = "/hello/{name}")
    public String apiHello(@PathVariable String name) {
        return service.sayHello(name);
    }

    @GetMapping(value = "/echo/{str}")
    public String remoteEcho(@PathVariable String str) {
        return serverFeignService.echo(str);
    }

    @GetMapping(value = "/protect/{methodName}")
    public String protectMethod(@PathVariable String methodName) {
        return "protect method";
    }
}