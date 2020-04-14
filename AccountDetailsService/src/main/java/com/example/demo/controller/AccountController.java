package com.example.demo.controller;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.GetAccountDetailsEntity;
import com.example.demo.dto.GetAccountDetailsDto;
import com.example.demo.service.AccountDetailsImpl;

@RestController
public class AccountController {
	@Autowired
	private AccountDetailsImpl account;
	
	@RequestMapping(value="/{phone}",method = RequestMethod.GET)
	GetAccountDetailsDto FindDetails(@PathVariable("phone")long phone)
	{
	GetAccountDetailsEntity entity= account.getAccount(phone);
	GetAccountDetailsDto dto= new GetAccountDetailsDto();
	BeanUtils.copyProperties(entity, dto);
		return dto;
		
	}
	

}
