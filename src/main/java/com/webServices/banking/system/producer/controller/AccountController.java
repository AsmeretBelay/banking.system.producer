package com.webServices.banking.system.producer.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.webServices.banking.system.producer.dto.AccountDto;
import com.webServices.banking.system.producer.entity.Account;
import com.webServices.banking.system.producer.entity.Transaction;
import com.webServices.banking.system.producer.service.AccountService;




@RestController
public class AccountController {
	
	@Autowired
	
  private AccountService accountService;
	
	 
	
	@PostMapping("/registerAccount")
	
	public Account saveAccount(@RequestBody Account account) {
		return accountService.registerAccount(account);
	}
	
	
	@GetMapping("/services/accounts/{accountNo}/balance")
	
	public double getbBalance(@PathVariable int accountNo) {
		
		return accountService.getBalance(accountNo);
	}
	
	@GetMapping("/services/accounts/{accountNo}/statement")
	
	
	public List<Transaction> getStatement(@PathVariable int accountNo){
	
		return accountService.getStatement(accountNo);
	

     }
	
	
	@PutMapping("/services/transactions/deposit")
	
	
	public 	String deposit( @RequestBody Account account) {
		
	       return accountService.deposit(account);
	       
	 }
	
	@GetMapping("/Accounts")
	
	public List<AccountDto> getAll() {
		return accountService.getAllAccounts();
		
	}
	
	@PutMapping("/services/transactions/withdraw")
	
	  public 	String  withdraw( @RequestBody Account account) {
		
		return accountService.withdraw(account);

	}
  // @PutMapping("/Transfer/{idd}/{id}/{amount}")
   
//   public  String transfer( @PathVariable int idd,@PathVariable int id,@PathVariable float amount) {
//	    return accountService.transfer( idd,id, amount);
//   }

}