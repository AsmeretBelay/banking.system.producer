package com.webServices.banking.system.producer.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.webServices.banking.system.producer.entity.Account;
import com.webServices.banking.system.producer.entity.Transaction;

public interface AccountRepository extends JpaRepository<Account, Integer> {
	
}
