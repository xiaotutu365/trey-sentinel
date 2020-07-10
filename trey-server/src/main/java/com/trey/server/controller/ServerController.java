package com.trey.server.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServerController {

    @GetMapping("/echo/{str}")
    public String echo(@PathVariable String str) {
        System.out.println("Hello Echo, " + str);
        return "Hello Echo, " + str;
    }
}