package com.webServices.banking.system.producer.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

//@JsonIgnoreProperties(ignoreUnknown= true)
//@JsonInclude(JsonInclude.Include.NON_NULL)

@Entity

public class Transaction {

	@Id
	@GeneratedValue (strategy=GenerationType.IDENTITY)
	
	private int transactionId;
	private String transactionType;
	private float amount;
	
@ManyToOne
@JsonIgnore
	  //@JoinColumn( name="account_id",referencedColumnName="accountNo")
	private Account account;
	
	public Transaction() {
		
	}
	
	public Transaction( Account account,String transactionType, float amount) {
		
		this.account = account;
		this.transactionType = transactionType;
		this.amount = amount;
		
		
	}


	


	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}
	public int getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}
	
	public String getTransactionType() {
		return transactionType;
	}
	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}
	public float getAmount() {
		return amount;
	}
	public void setAmount(float amount) {
		this.amount = amount;
	}
	
	
}
