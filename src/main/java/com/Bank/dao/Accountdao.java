package com.Bank.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.Bank.entity.Account;
import com.Bank.repository.AccountRepository;

@Repository
public class Accountdao {
	@Autowired
	AccountRepository ar;
	public String setAccount(Account account) {
		ar.save(account);
		return "Done";
		
	}
	public String setAllaccount(List<Account> account) {
		
		 ar.saveAll(account);
		 return "active";
	}
	public List<Account> getAllaccount() {
		 return ar.findAll();
	}
	public Account getbyid(int x) {
		
		return ar.findById(x).get();
	}
	public List<Account> getbyname(String c) {
		
		return ar.getbyname(c);
	}
	


}
