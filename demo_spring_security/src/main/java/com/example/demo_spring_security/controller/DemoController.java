package com.example.demo_spring_security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("/Hello")
    public  String welcome(){
        return "salut tout le monde, vous allez bien ?";
    }

}
