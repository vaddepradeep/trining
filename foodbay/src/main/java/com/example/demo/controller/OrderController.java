package com.example.demo.controller;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Dao.OrderDao;
import com.example.demo.Dao.OrderResStatusDao;
import com.example.demo.dto.OrderDto;
import com.example.demo.dto.OrderResStatusDto;
import com.example.demo.service.OrderServiceImpl;
@RestController
public class OrderController {
	@Autowired
	private  OrderServiceImpl oser;
	@RequestMapping(value ="/process", method = RequestMethod.POST,consumes = "application/json")
	public OrderResStatusDto placeOrder(@RequestBody OrderDto dto)
	{
		OrderDao dao= new OrderDao();
		BeanUtils.copyProperties(dto, dao);
		OrderResStatusDao resdao=oser.processOrderService(dao);
		OrderResStatusDto resdto= new OrderResStatusDto();
		BeanUtils.copyProperties(resdao, resdto);
		return resdto;
		
		
	}
	

}
