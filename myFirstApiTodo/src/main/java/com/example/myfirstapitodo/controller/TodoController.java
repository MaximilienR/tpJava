package com.example.myfirstapitodo.controller;

import org.apache.catalina.connector.Response;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("todo")
public class TodoController {

    @GetMapping()
    public Response<String> get(){
        return  Response.status(200).body("tout va bien");
    }
}
