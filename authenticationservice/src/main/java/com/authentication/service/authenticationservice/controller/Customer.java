package com.authentication.service.authenticationservice.controller;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Customer {
    @Id
    private String emailId;
    private String custName;
    private String password;
    private long accountNumber;
    private String bankName;
    private long balance;
    
    
}
