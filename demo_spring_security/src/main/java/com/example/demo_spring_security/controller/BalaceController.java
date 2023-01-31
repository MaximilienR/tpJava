package com.example.demo_spring_security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BalaceController {
    @GetMapping("/myBalance")
    public  String welcome(){return  "balance controller" ;}
}
