package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    @GetMapping("/")
    public String welcome () {
        System.out.println("Thanks All for the good work");
        return "Hello Ahmed!";
    }
}
