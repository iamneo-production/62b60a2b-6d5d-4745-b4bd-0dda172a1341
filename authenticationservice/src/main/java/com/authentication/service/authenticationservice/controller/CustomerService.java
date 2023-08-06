package com.authentication.service.authenticationservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class CustomerService {
    
    @Autowired
    private CustomerRepository customerRepository;


    public Customer addCustomer(Customer customer){
        Customer cust = customerRepository.save(customer);
        return cust;
    }

    public Customer getCustomer(Customer customer){
        Customer cust = customerRepository.findOneByEmailIdIgnoreCaseAndPassword(customer.getEmailId() , customer.getPassword());
        return cust;
    }

    public Customer getSingleCustomer(String emailId){
        Customer cust = customerRepository.findByEmailId(emailId);
        return cust;
    }
    

}
