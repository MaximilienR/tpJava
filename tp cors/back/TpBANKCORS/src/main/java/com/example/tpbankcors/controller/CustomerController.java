package com.example.tpbankcors.controller;

import com.example.tpbankcors.dto.request.CustomerCreateDTO;
import com.example.tpbankcors.dto.request.CustomerInterfaceDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("customer")
public class CustomerController {

@PostMapping("/create-customer")
   public ResponseEntity<CustomerInterfaceDto>createCostomer(@RequestBody CustomerCreateDTO customerDto){
    return  new ResponseEntity<>(customerServ)
}
@DeleteMapping()
    public ResponseEntity<String> delete(){
    return null;
}
}

