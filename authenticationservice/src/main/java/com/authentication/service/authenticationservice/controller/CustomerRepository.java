package com.authentication.service.authenticationservice.controller;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer ,String>{
    
    Customer findOneByEmailIdIgnoreCaseAndPassword(String emailId, String password);
    Customer findByEmailId(String emailId);
    
}
