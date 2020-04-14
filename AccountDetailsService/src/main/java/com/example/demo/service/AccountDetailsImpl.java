package com.example.demo.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.GetAccountDetailsEntity;
import com.example.demo.repo.AccountRepo;

@Service
public class AccountDetailsImpl implements AccountDetais {
	@Autowired
	private AccountRepo repo;

	@Override
	public GetAccountDetailsEntity getAccount( long phone) {
		long l=repo.findAccByPhone(phone);
	GetAccountDetailsEntity entity= new GetAccountDetailsEntity();
		entity.setAcno(l);
		return entity;
	}

}
