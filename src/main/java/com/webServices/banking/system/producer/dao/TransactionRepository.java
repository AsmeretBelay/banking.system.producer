package com.webServices.banking.system.producer.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Modifying;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.query.Param;
//import org.springframework.transaction.annotation.Transactional;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.webServices.banking.system.producer.entity.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction, Integer>{

//	public List<Transaction> findAllById(List<Transaction> transactions);
//	
//	
//public	Transaction getStatement(int accountNo);

//@Modifying
//
//@Transactional
//	
//@Query(value="SELECT t from transaction t join  t.accountNo where t.accountNo Like %?1%")
//	
//	public List<Transaction> getStatement( int accountNo);
//	
	//List<Transaction> findBy
	
	
//	@Query("from Transaction where Account.accountNo= :accountNo  ")
//	
//	List<Transaction> getStatement(int accountNo);
//@Query(value="SELECT t from Transaction t join  a.accountNo and t.transaction where a.account_no= :?account_no")
//	
//	public List<Transaction> getStatement( @Param(value = "account_no") int accountNo);
//	

}
