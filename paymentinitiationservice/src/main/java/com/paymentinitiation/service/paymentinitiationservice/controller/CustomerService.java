package com.paymentinitiation.service.paymentinitiationservice.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="CUSTOMER-SERVICE")
public interface CustomerService {

    @GetMapping("/customer/{emailId}")
    Customer getCust(@PathVariable String emailId);

    @PostMapping("/customer/signup")
    Customer getCustomer(Customer customer);
    
}
