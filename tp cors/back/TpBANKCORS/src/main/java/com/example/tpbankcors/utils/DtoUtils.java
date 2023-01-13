package com.example.tpbankcors.utils;

import com.example.tpbankcors.dto.request.CustomerCreateDTO;
import com.example.tpbankcors.dto.response.CustomerDTO;
import com.example.tpbankcors.entity.Customer;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.lang.reflect.Type;

@Component
public class DtoUtils {

    public CustomerDTO convertToDtO(Customer customer){
        return  new ModelMapper().map(customer,CustomerDTO.class);
    }
    public Customer customer(CustomerCreateDTO customerCreateDTO){
        return new  ModelMapper().map(customerCreateDTO,Customer.class);
    }
}


