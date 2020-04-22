package com.example.demo.controller;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.PaymentDao;
import com.example.demo.dao.PaymentResDao;
import com.example.demo.dto.PaymentDto;
import com.example.demo.dto.PaymentResDto;
import com.example.demo.service.PaymentServiceImpl;

@RestController
public class PaymentController {
	@Autowired
	private PaymentServiceImpl pimpl;
	@RequestMapping(value="/pay",method = RequestMethod.POST,consumes = "application/json")
	PaymentResDto doPayment(@RequestBody PaymentDto dto)
	{
		PaymentDao  dao = new PaymentDao();
		BeanUtils.copyProperties(dto, dao);
		PaymentResDao resdao= pimpl.doPaymentSer(dao);
		PaymentResDto resdto= new PaymentResDto();
		BeanUtils.copyProperties(resdao, resdao);
		return resdto;
		
	}
	

}
