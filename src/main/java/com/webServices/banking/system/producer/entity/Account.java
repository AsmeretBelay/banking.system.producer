package com.webServices.banking.system.producer.entity;


import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

import javax.persistence.OneToMany;


@Entity

public class Account {
	
	@Id
	@GeneratedValue (strategy=GenerationType.IDENTITY)
	
	private int accountNo;////primary key
	private String firstName;
	private String lastName;
	private double balance;
	
	
   // @OneToMany (targetEntity= Transaction.class, cascade= CascadeType.ALL, fetch = FetchType.LAZY)
    
//	@JsonIgnoreProperties(ignoreUnknown= true)
//	@JsonInclude(JsonInclude.Include.NON_NULL)
//	
@OneToMany(mappedBy="account")
	
   private List<Transaction> transactions;
 
	public Account() {
	
     }

	public Account( String firstName, String lastName, double balance)
		 {
		

	
	this.firstName = firstName;
	this.lastName = lastName;
	this.balance = balance;
	
	//this.transactions = transactions;
}


	public List<Transaction> getTransactions() {
		return transactions;
	}


	public void setTransactions(List<Transaction> transactions) {
		this.transactions = transactions;
	}


	public int getAccountNo() {
		return accountNo;
	}


	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public double getBalance() {
		return balance;
	}


	public void setBalance(double balance) {
		this.balance = balance;
	}


	
  
	
	
	
	
	
	
	
	
	
	
	
}

