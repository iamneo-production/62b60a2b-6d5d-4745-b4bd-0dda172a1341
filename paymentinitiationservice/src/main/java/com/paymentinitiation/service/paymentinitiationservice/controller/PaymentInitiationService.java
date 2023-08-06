package com.paymentinitiation.service.paymentinitiationservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentInitiationService {
    
    @Autowired
    private PaymentInitiationRepository paymentInitiationRepository;

    @Autowired
    private CustomerService customerService;

   
    public PaymentInitiation addPaymentDetails(PaymentInitiation paymentInitiation){
        PaymentInitiation payment = paymentInitiationRepository.save(paymentInitiation);
        return payment;
    }

    public PaymentInitiation getPaymentDetails(long paymentId){
         PaymentInitiation pay = paymentInitiationRepository.findByPaymentId(paymentId);
         Customer customer=new Customer();
         Customer cust=customerService.getCust(customer.getEmailId());
         PaymentInitiation paymentInitiation=new PaymentInitiation();
        long balance=customer.getBalance();
        long amtToSend=paymentInitiation.getAmountToPay();
        if(balance>amtToSend){
            System.out.println("Payment initiated");
        }
        else{
            System.out.println("Insufficient balance");
        }
        return pay;
    }
}
