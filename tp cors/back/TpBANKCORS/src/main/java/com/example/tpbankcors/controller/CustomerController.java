package com.example.tpbankcors.controller;

import com.example.tpbankcors.dto.response.CustomerDTO;
import com.example.tpbankcors.service.impl.CustomerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("customer")
public class CustomerController {

    @Autowired
    CustomerServiceImpl customerServiceImpl;

@PostMapping("/create-customer")
   public ResponseEntity<CustomerDTO>createCostomer(@RequestBody CustomerDTO customerDto){
    return  new ResponseEntity<>(customerServiceImpl.createCustomer(customerDto), HttpStatus.CREATED);
}
@DeleteMapping()
    public ResponseEntity<String> delete(){
    return null;
}
}

