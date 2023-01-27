package com.example.tpspringbootangularmongodb.service;

import com.example.tpspringbootangularmongodb.entity.Employe;
import com.example.tpspringbootangularmongodb.repository.EmployeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeService {

    @Autowired
    EmployeRepository employeRepository;

    public Employe createEmploye(Employe employe)
    {return employeRepository.save(employe);}

    public  Employe updateEmploye(Employe employe) {
        return  employeRepository.save(employe);
    }

}
