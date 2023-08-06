package com.paymentinitiation.service.paymentinitiationservice.controller;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PaymentInitiation {
    
    @Id
    private long paymentId;
    private long amountToPay;
    
    
}
