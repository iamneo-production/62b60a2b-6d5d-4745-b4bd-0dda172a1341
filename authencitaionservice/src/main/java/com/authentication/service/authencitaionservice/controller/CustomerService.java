package com.authentication.service.authencitaionservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepo customerRepo;

    public Customer saveCustomer(Customer customer){
        Customer c=customerRepo.save(customer);
        return c;
    }

    
}
