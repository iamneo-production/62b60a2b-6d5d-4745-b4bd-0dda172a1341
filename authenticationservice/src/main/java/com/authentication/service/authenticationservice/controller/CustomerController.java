package com.authentication.service.authenticationservice.controller;

import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;

@RestController
@RequestMapping("/customer")
public class CustomerController {
    
    @Autowired
    private CustomerService customerService;

    @PostMapping("/signup")
    public ResponseEntity<Customer> registration(@RequestBody Customer customer){
        Customer cust = customerService.addCustomer(customer);
        return ResponseEntity.status(HttpStatus.CREATED).body(cust);
    }

    @PostMapping("/login")
    public ResponseEntity<Customer> login(@RequestBody Customer customer){
        Customer log = customerService.getCustomer(customer);
        return  ResponseEntity.status(HttpStatus.CREATED).body(log);
    }

    @GetMapping("/{emailId}")
    public ResponseEntity<Customer> getCustomer(@PathVariable String emailId){
        Customer getCust = customerService.getSingleCustomer(emailId);
        return  ResponseEntity.status(HttpStatus.CREATED).body(getCust);
    }
}
