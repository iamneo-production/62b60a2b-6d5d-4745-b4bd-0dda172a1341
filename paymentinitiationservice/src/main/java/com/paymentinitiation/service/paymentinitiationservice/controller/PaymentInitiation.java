package com.paymentinitiation.service.paymentinitiationservice.controller;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PaymentInitiation {
    
    @Id
    private long paymentId;
    private long amount;
    private long accountNumber;
    private String typeOfPayment;
    
}
