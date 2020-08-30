package com.example.controller.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    
    @GetMapping("/helloSpring")
    public String hello(){
        return "Hello Spring Boot!";
    }

    @GetMapping("/helloSpring2")
    public String hello2(){
        return "Hello Spring Boot2!";
    }

}