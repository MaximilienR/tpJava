package com.example.tpspringbootangularmongodb.controller;

import com.example.tpspringbootangularmongodb.entity.Employe;
import com.example.tpspringbootangularmongodb.service.EmployeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/employe")
public class EmployeController {

    @Autowired
    private EmployeService employeService;

    @PostMapping("/create")
    public Employe createEmploye(@RequestBody Employe employe){
        return  employeService.createEmploye(employe);
    }
}
