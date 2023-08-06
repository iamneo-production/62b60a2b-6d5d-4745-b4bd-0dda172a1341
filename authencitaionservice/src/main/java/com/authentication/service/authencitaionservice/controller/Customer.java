package com.authentication.service.authencitaionservice.controller;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Customer {

    @Id
    private long cId;
    private String fName;
    private String lName;
    private String email;
    private String password;



    
}
