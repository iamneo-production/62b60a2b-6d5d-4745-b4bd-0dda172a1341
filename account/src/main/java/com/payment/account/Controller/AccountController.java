package com.payment.account.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

// import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestBody;
// import org.springframework.web.bind.annotation.PutMapping;

import com.payment.account.Entity.Customer;
import com.javatechie.dto.AuthRequest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import com.payment.account.ServiceImpl.AccountServiceImpl;
import com.payment.account.dto.AuthRequest;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;

@RestController
// @RequestMapping("/accounts")
@RequestMapping("/customer")
public class AccountController {

    @Autowired
    AccountServiceImpl accountservice;

    // @GetMapping("/{Id}")
    // public ResponseEntity<Optional<Account>> getAccount(@PathVariable int Id){
    //     Optional<Account> acc= accountservice.getAccount(Id);
    //     return ResponseEntity.status(HttpStatus.OK).body(acc);
    // }
    
    // @PutMapping("/{accountId}")
    // public ResponseEntity<Account> updateAccount(@PathVariable int accountId,Account account){
    //     return ResponseEntity.status(HttpStatus.OK).body(accountservice.updateAccount(accountId,account));
    // }

    // @Autowired

    // private CustomerService customerService;

 

    @PostMapping("/signup")

    public ResponseEntity<Customer> registration(@RequestBody Customer customer){

        Customer cust = accountservice.addCustomer(customer);

        return ResponseEntity.status(HttpStatus.CREATED).body(cust);

    }

 

    @PostMapping("/login")

    public ResponseEntity<Customer> login(@RequestBody Customer customer){

        Customer log = accountservice.getCustomer(customer);

        return  ResponseEntity.status(HttpStatus.OK).body(log);

    }

    @PostMapping("/token")
    public String getToken(@RequestBody AuthRequest authRequest) {
        Authentication authenticate = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(authRequest.getEmailId(), authRequest.getPassword()));
        if (authenticate.isAuthenticated()) {
            return accountservice.generateToken(authRequest.getEmailId());
        } else {
            throw new RuntimeException("invalid access");
        }
    }

    @GetMapping("/validate")
    public String validateToken(@RequestParam("token") String token) {
        accountservice.validateToken(token);
        return "Token is valid";
    }
    
}
