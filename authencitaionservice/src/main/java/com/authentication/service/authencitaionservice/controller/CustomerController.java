package com.authentication.service.authencitaionservice.controller;

import org.springframework.http.HttpStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer")
public class CustomerController {
     
    @Autowired
    private CustomerService customerService;

    @GetMapping
    public String greet(){
        return "Good morning";
    }


    @PostMapping
    public ResponseEntity<Customer> addcustomer(@RequestBody Customer customer){
       Customer customer1 = customerService.saveCustomer(customer);
       return ResponseEntity.status(HttpStatus.CREATED).body(customer1);

    }
}
