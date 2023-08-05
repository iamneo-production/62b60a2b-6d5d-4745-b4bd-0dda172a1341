package com.payment.account.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString

@Entity
public class Customer {

    @Id
    private String emailId;
    private String custName;
    private String password;
    private long accountNumber;
    private String bankName;
    private long balance;


}
