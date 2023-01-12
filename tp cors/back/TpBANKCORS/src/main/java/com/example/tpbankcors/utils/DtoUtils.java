package com.example.tpbankcors.utils;

import com.example.tpbankcors.dto.response.CustomerDTO;
import com.example.tpbankcors.entity.Customer;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class DtoUtils {

    public CustomerDTO convertToDtO(Customer customer,CustomerDTO customerDTO) {
        return  new  ModelMapper().map(customer,customerDTO.getClass());}
}
