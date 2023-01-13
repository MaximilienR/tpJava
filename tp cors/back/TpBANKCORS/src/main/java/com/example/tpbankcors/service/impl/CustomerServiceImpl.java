package com.example.tpbankcors.service.impl;

import com.example.tpbankcors.dto.request.CustomerCreateDTO;
import com.example.tpbankcors.dto.request.CustomerReadDto;
import com.example.tpbankcors.dto.response.CustomerDTO;
import com.example.tpbankcors.entity.Customer;
import com.example.tpbankcors.respository.CustomerRepository;
import com.example.tpbankcors.service.CustomerService;
import com.example.tpbankcors.utils.DtoUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    public List<CustomerCreateDTO> customerDTOS;

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private DtoUtils dtoUtils;
    @Override
    public CustomerDTO createCustomer(CustomerCreateDTO customerDTO){
        Customer customer=dtoUtils.customer(customerDTO);
        Customer customer1=customerRepository.save(customer);
         return dtoUtils.convertToDtO(customer1);
    }


    @Override
    public  CustomerDTO readCustomer(Integer id){
        return dtoUtils.convertToDtO(customerRepository.findById(id).get());
    }
}
