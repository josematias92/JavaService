package com.example.myFirstJavaService.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class healthController {
    
    @GetMapping("/ping") // Maps GET requests for /ping to this method
    public String ping() {
        return "pong";
    }
}
