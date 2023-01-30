package com.example.tpspringbootangularmongodb.service;

import com.example.tpspringbootangularmongodb.entity.Employe;
import com.example.tpspringbootangularmongodb.repository.EmployeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeService {

    @Autowired
    EmployeRepository employeRepository;

    public Employe createEmploye(Employe employe)
    {return employeRepository.save(employe);}

    public Employe getEmployeById(String id){
        return employeRepository.findById(id).get();
    }

    public List<Employe>getAllEmploye(){
        return  employeRepository.findAll();
    }
    public  Employe updateEmploye(Employe employe) {
        return  employeRepository.save(employe);
    }

    public String deleteEmploye(String id){
        employeRepository.deleteById(id);
        return "suppression reussit";
    }

}
