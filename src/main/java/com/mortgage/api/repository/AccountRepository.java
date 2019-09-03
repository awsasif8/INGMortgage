package com.mortgage.api.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mortgage.api.entity.Account;


@Repository
public interface AccountRepository extends JpaRepository<Account, Integer> {
	
	public List<Account> findByUserId(String userId);
	
	public Account findByAccountTypeAndUserId(String accountType,String userId);

	public Account findByUserIdAndAccountType(String userId, String transaction);
}