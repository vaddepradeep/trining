package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.conf.DemoFeign;
import com.example.demo.dto.PamentDto;
import com.example.demo.dto.PaymentResDto;

@RestController
public class PaymentController {
	@Autowired
	private  DemoFeign dfign;
	@RequestMapping(value = "/pay",method =RequestMethod.POST,consumes = "application/json")
	PaymentResDto doPayment(@RequestBody  PamentDto dto)
	{
		PaymentResDto resdto= dfign.doPayment(dto);
		if(resdto.getPcode()==200)
		{
			
		}
		return resdto;

}
}
