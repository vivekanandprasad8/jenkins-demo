package com.example.vivek.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    private static final Logger log = LoggerFactory.getLogger(HelloController.class);

    @GetMapping("/hello")
    public String hello() {
        log.info("Received request for /hello endpoint  - returning greeting message.");
        return "Hello, World! Welcome to Spring Boot! Now you can run this application and access the /hello endpoint to see this message.";
    }
}
