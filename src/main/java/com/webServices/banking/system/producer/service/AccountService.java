package com.webServices.banking.system.producer.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.webServices.banking.system.producer.dao.AccountRepository;
import com.webServices.banking.system.producer.dao.TransactionRepository;
import com.webServices.banking.system.producer.dto.AccountDto;
import com.webServices.banking.system.producer.entity.Account;
import com.webServices.banking.system.producer.entity.Transaction;
import com.webServices.banking.system.producer.mapper.AccountDtoMapper;


@Service
public class AccountService {
	
	@Autowired
	
	private AccountRepository  accountRepo;
	
	@Autowired
	private TransactionRepository transRepo;
	
	
	public List<AccountDto> getAllAccounts(){
		List<Account> accounts= accountRepo.findAll();
	    List<AccountDto> accountDto=new ArrayList<>();
		for(Account account : accounts) {
			accountDto.add(AccountDtoMapper.mapAccountEntityToDto(account));
		}
	   return accountDto;
	  }
	
	
	public Account registerAccount(Account account) {
	
		return accountRepo.save(account);
		
	}
	
	
	public double getBalance( int accountNo) {
		
		Account account=accountRepo.findById(accountNo).get();
		
		return account.getBalance();
	}
	
   public List<Transaction> getStatement(int accountNo) {
	   Account account=accountRepo.findById(accountNo).get();
	   return account.getTransactions();
	       
    }
//   public List<Transaction> getStatement() {
//	      
//		    return transRepo.findAll();
//   }       
	
	public String withdraw(Account account ) {
		
		Account acc = accountRepo.findById(account.getAccountNo()).get();
		 
		  double balance= acc.getBalance();
		  
		  float amount= (float) account.getBalance();
		
		  double newBalance = balance - amount;
		  
		  account.setBalance(newBalance);
		  accountRepo.save(account);
		  
			 
			if(amount > balance) {
				 
				 return "Insufficient Balance";
				 
			  }
						
			Transaction trans= new Transaction(account,"withdraw",(amount*-1));

			 transRepo.save(trans);
			   
	  return "Successfully withdrawn your current balance is: $"+ newBalance  ;
	
	            
		}

	 public String deposit(Account account) {
		 

	      Account acc = accountRepo.findById(account.getAccountNo()).get();
		 
		  double balance= acc.getBalance();
		  
		  float amount= (float) account.getBalance();
		
		  double newBalance = balance + amount;
		  
		  account.setBalance(newBalance);
		  accountRepo.save(account);
		  
			Transaction trans= new Transaction(account,"deposit",amount);

		  transRepo.save(trans);
		   
		  return "Successfully deposited your current balance is: $"+ newBalance  ;

		 
	  }
		public String transfer(int id,Account accountTo , float amount) {
			Account accountFrom = accountRepo.getById(id);
			
			
		

//             accountFrom.setBalance(amount); 
//             
//			 withdraw(accountFrom);
			 
			 //accountFrom.setAccountNo(id);
			 //deposit(accountFrom);
			 
//			double amount= accountFrom.getBalance();
//			
//			Account accountTo = accountRepo.getById(id);
//			double oldBalance=accountTo.getBalance();
//			double newBalance= amount+oldBalance;
//		  	Account accountTo = accountRepo.getById(id);
//			  	accountTo.setBalance(amount);
//			  	deposit(accountTo);
//			  	
			  //accountTo.setBalance(newBalance);
			  

			  //deposit(accountTo);
			//accountFrom.
			
			
			
			
			return "Succesfully Transffered"  ;
			
			
		}

	
	
	
	
}

	
	