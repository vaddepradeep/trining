package com.example.demo.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.dao.TransferResponseDao;
import com.example.demo.dto.AmountTransferDto;

@FeignClient(name = "http://BANKSERVICE")
public interface DemoFeign {
	public @RequestMapping(value="/{phone}")
	double checkBalance(@PathVariable("phone")long phone);
	

@RequestMapping(value="/transfer",method = RequestMethod.POST,consumes = "application/json")
public TransferResponseDao  amountTransfer(@RequestBody AmountTransferDto dto);
}
