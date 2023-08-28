package com.Bank.repository;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.Bank.entity.Account;

public interface AccountRepository extends JpaRepository<Account, Integer> {

	@Query(value = "select * from account _details where id like ?", nativeQuery = true)
	List<Account> getbyid(int b);

	@Query(value = "select * from account_details where name like ? ", nativeQuery = true)
	List<Account> getbyname(String c);
	

	

}
