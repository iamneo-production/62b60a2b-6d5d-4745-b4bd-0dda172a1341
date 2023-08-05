package com.payment.account.ServiceImpl;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.payment.account.Entity.Customer;
import com.payment.account.Repository.AccountRepository;
// import com.payment.account.Service.AccountService;

@Service
public class AccountServiceImpl {

    @Autowired
    AccountRepository accountrepo;

     @Autowired
    AccountRepository repository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private JwtService jwtService;


	// @Override
	// public Optional<Account> getAccount(int Id) {
	// 	return accountrepo.findById(Id);
	// }

	// @Override
	// public Account updateAccount( int accountId, Account account) {
    //     Account acct = accountrepo.findById(accountId).get();
	// 	return accountrepo.save(acct);
	// }



 

    // @Autowired

    // private BCryptPasswordEncoder passwordEncoder;

 

    // public Customer findCustomerByEmailId(String emailId){

    //     return customerRepository.findByEmailId(emailId).orElseThrow(EntityNotFoundException::new);

    // }

 

    public Customer addCustomer(Customer customer){

        Customer cust = accountrepo.save(customer);

        return cust;

    }

 

    public Customer getCustomer(Customer customer){

        Customer cust = accountrepo.findOneByEmailIdIgnoreCaseAndPassword(customer.getEmailId() , customer.getPassword());

        return cust;

    }

   

    public String saveUser(Customer credential) {
        credential.setPassword(passwordEncoder.encode(credential.getPassword()));
        repository.save(credential);
        return "user added to the system";
    }

    public String generateToken(String username) {
        return jwtService.generateToken(username);
    }

    public void validateToken(String token) {
        jwtService.validateToken(token);
    }
    
}
