package com.paymentinitiation.service.paymentinitiationservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class PaymentinitiationserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(PaymentinitiationserviceApplication.class, args);
	}

}
