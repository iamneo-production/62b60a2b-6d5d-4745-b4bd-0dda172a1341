package com.paymentinitiation.service.paymentinitiationservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/payments")
public class PaymentInitiationController {
    
    @Autowired
    private PaymentInitiationService paymentInitiationService;

    @PostMapping
    public ResponseEntity<PaymentInitiation> paymentDetails(@RequestBody PaymentInitiation paymentInitiation){
        PaymentInitiation pay = paymentInitiationService.addPaymentDetails(paymentInitiation);
        return ResponseEntity.status(HttpStatus.CREATED).body(pay);
    }

     @GetMapping("/{paymentId}")
    public ResponseEntity<PaymentInitiation> getCustomer(@PathVariable long paymentId){
        PaymentInitiation paymentInitiation=new PaymentInitiation();
        PaymentInitiation payDetails = paymentInitiationService.getPaymentDetails(paymentInitiation.getPaymentId());
        return  ResponseEntity.status(HttpStatus.CREATED).body(payDetails);
    }
}
