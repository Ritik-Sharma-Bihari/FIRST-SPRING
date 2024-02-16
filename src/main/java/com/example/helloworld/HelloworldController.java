package com.example.helloworld;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController

public class HelloworldController {

    @GetMapping("/")

    public String getWelcomeString() {
        return "Wlecome Spring boot";
    }

    @GetMapping("/name")
    public String getName() {
        return "Ritik sharma";
    }

}