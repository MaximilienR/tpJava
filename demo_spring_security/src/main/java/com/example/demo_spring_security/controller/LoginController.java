package com.example.demo_spring_security.controller;

import com.example.demo_spring_security.entity.Customer;
import com.example.demo_spring_security.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @Autowired
    CustomerRepository customerRepository;


    @PostMapping("/register")
    public ResponseEntity<String> registerUser(@RequestBody Customer customer){
        Customer customer1 = null;
        ResponseEntity response = null;
        try {
            customer1 = customerRepository.save(customer);
            if(customer1.getId()>0){
                response = ResponseEntity.status(HttpStatus.CREATED).body("");
            }

        }catch (Exception e){

        }
        return  response;
    }



}