      package com.Bank.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Bank.dao.Accountdao;
import com.Bank.entity.Account;

@Service
public class AccountService {
	
	@Autowired
	Accountdao ad;
	
	
	public String setAccount(Account account) {
	
		return  ad.setAccount(account);
	}

	public String setAllaccount(List<Account> account) {
		
		return ad.setAllaccount(account);
	}

	public List<Account> getAllaccount() {
		
		return ad.getAllaccount();
	}

	public Account getbyid(int x) {
		
		return ad.getbyid(x);
	}

	public List<Account> getbyname(String c) {
		
		return ad.getbyname(c);
	}
	
		
	}


