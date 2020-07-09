package com.trey.client.service;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import org.springframework.stereotype.Service;

@Service
public class TestService {
    @SentinelResource(value = "sayHello", blockHandler = "exceptionHandler")
    public String sayHello(String name) {
        return "Hello, " + name;
    }

    public String exceptionHandler(String name, BlockException e) {
        return "You are limited";
    }
}