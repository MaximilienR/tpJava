package com.example.demo_spring_security.controller;

import com.example.demo_spring_security.entity.Customer;
import com.example.demo_spring_security.repository.CustomerRepository;
import org.apache.tomcat.util.net.openssl.ciphers.Authentication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LoginController {

    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;



    @PostMapping("/register")
    public ResponseEntity<String> registerUser(@RequestBody Customer customer){
        Customer customer1 = null;
        ResponseEntity response = null;
        try {
            String hashPwd= passwordEncoder.encode(customer.getPwd());
            customer1.setPwd(hashPwd);
            customer1 = customerRepository.save(customer);
            if(customer1.getId()>0){
                response = ResponseEntity.status(HttpStatus.CREATED).body("User registered");
            }
        }catch (Exception e){
            response = ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Une erreur est survenue " + e.getMessage());
        }
        return response;
    }

@RequestMapping("/user")
    public Customer getUserDetailsAfterLogin(Authentication authentication){
    List<Customer>customers = customerRepository.findByEmail(a)
}

}


