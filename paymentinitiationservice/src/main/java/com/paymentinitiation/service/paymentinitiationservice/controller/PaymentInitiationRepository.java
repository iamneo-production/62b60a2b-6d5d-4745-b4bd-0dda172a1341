package com.paymentinitiation.service.paymentinitiationservice.controller;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentInitiationRepository extends JpaRepository<PaymentInitiation, Long>{
     PaymentInitiation findByPaymentId(long paymentId);
}
