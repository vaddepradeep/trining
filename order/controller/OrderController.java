package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.OrderDto;

@RestController
public class OrderController {
	ArrayList<OrderDto> orders= new ArrayList();
	
	OrderDto order1= new  OrderDto(1, "lappy", "i5 with 4gb");
	OrderDto order2= new OrderDto(2,"tv","L.G ");
	 @RequestMapping(value = "/list")
	 public List getOrderList()
	{ 
		 
		 orders.add(order1);
		 orders.add(order2);
		 
		return orders;
		 
	 }
	 @RequestMapping("/{id}")
	 public OrderDto getOrder(@PathVariable("id") int id)
	 {
	OrderDto dto	= orders.get(id);
		 
		return dto;
		 
	 }
	 @RequestMapping(value = "/create",method = RequestMethod.POST)
	 public ResponseEntity<String> createOrder(@RequestBody OrderDto dto)
	 {
		orders.add(dto) ;
		return new ResponseEntity<String>( HttpStatus.CREATED);
	 }
	 }
