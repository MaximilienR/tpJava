package com.example.tpbankcors.service;

import com.example.tpbankcors.dto.request.CustomerCreateDTO;
import com.example.tpbankcors.dto.response.CustomerDTO;
import com.example.tpbankcors.entity.Customer;

public interface CustomerService {

    public CustomerDTO createCustomer(CustomerCreateDTO customerCreateDTO);

     CustomerDTO readCustomer(Integer id);
}
