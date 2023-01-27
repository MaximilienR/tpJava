package com.example.tpspringbootangularmongodb.controller;

import com.example.tpspringbootangularmongodb.entity.Employe;
import com.example.tpspringbootangularmongodb.service.EmployeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/employe")
public class EmployeController {

    @Autowired
    private EmployeService employeService;

    @PostMapping("/create")
    public Employe createEmploye(@RequestBody Employe employe){
        return  employeService.createEmploye(employe);
    }
    @PutMapping("/update")
    public  Employe update(@RequestBody Employe employe){
        return  employeService.updateEmploye(employe);
    }
    @DeleteMapping("/delete/{id}")
    public  String delete(@PathVariable String id){
        return  employeService.deleteEmploye(id);
    }
}
