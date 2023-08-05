package com.payment.account.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.payment.account.Entity.Customer;

public interface AccountRepository extends JpaRepository<Customer, String>{
    Customer findOneByEmailIdIgnoreCaseAndPassword(String emailId, String password);
}
