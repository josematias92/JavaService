package com.example.myFirstJavaService.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class healthController {

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("title", "✨ Pixel Bunny Gallery ✨");
        model.addAttribute("message", "🎨 Created with Pixel Love 🎨");
        return "bunny";
    }

    @GetMapping("/ping")
    public String ping() {
        return "pong";
    }

    @GetMapping("/dashboard")
    public String dashboard() {
        return "dashboard";
    }
}
