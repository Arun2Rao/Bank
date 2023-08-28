package com.Bank.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Bank.entity.Account;
import com.Bank.service.AccountService;
@RestController
@RequestMapping(value="/ban")
public class AccountController {
	@Autowired
	
	AccountService as;
	@PostMapping(value="/setAccount")
	public String setAccount(@RequestBody Account account) {
		return as.setAccount(account);
		
	}
	@PostMapping(value="/setAllaccount")
	public String setAllaccount(@RequestBody List<Account>account) {
		return as.setAllaccount(account);
		
	}
	@GetMapping(value="/getAllaccount")
	public List<Account>getAllaccount(){
		return as.getAllaccount();
	}
	@GetMapping(value="/getbyid/{x}")
	public Account getbyid(@PathVariable int x) {
		return as.getbyid(x);
		
	}
	@GetMapping(value="/getbyname/{c}")
			public List<Account> getbyname(@PathVariable String c) {
		return as.getbyname(c);
	}

	

}
