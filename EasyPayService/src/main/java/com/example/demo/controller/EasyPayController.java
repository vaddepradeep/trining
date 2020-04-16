package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.RegisterDao;
import com.example.demo.dao.TransferResponseDao;
import com.example.demo.dto.AmountTransferDto;
import com.example.demo.dto.RegisterDto;
import com.example.demo.dto.TransferResponseDto;
import com.example.demo.feign.DemoFeign;
import com.example.demo.service.RegisterServiceImpl;

@RestController
public class EasyPayController {
	@Autowired
	private RegisterServiceImpl service;
	@Autowired
	private DemoFeign feignser;
	
	@RequestMapping(value="register",method = RequestMethod.POST,consumes = "application/json")
public TransferResponseDto doRegister(@RequestBody RegisterDto dto )
{
		RegisterDao dao= new RegisterDao();
		BeanUtils.copyProperties(dto, dao);
		 TransferResponseDao resdao =service.doRigegister(dao);
		 TransferResponseDto resdto=new TransferResponseDto();
		 BeanUtils.copyProperties(resdao, resdto);
		
		 
	return resdto;
	
}
	
	
	public boolean checkStatus(long phone)
	{
		boolean b=service.checkStatusService(phone);
				if(b)
					return true;
				else 
					return false;
	}
	
	
	
	@RequestMapping(value="/transfer",method = RequestMethod.POST,consumes = "application/json")
	public AmountTransferDto  anountTransfer(@RequestBody AmountTransferDto dto)
	{
		if(checkStatus(dto.getTono()))
		{
			
		TransferResponseDao resdao= feignser.amountTransfer(dto);
		TransferResponseDto resdto= new TransferResponseDto();
		BeanUtils.copyProperties(resdao,resdto);
			return resdto;
		else
		{
		return resdto.getMsg("amount not trasfred");
		}	
		}
	}
		@GetMapping("/{phome}")
		public double getBalance(@PathVariable("phome") long phone)
		{
		return	feignser.checkBalance(phone);
		}
		
		@GetMapping("/list")	
	public List transactionList()
	{
		return null;
		
	}
		
	
	}
	
	




