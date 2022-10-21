package com.webServices.banking.system.producer.mapper;

import com.webServices.banking.system.producer.dto.AccountDto;
import com.webServices.banking.system.producer.entity.Account;

public class AccountDtoMapper {

	
public static AccountDto mapAccountEntityToDto(Account account) {
		
		return new AccountDto(account.getAccountNo(), account.getFirstName(), account.getLastName(), account.getBalance());
		
	}
	
}
