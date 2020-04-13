package com.example.demo.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.OrderDto;
import com.example.demo.feign.DemoFeign;

@RestController
public class FigenController {
	@Autowired
	private DemoFeign figen;
	@RequestMapping("/")
	public List findAll()
	{
		return figen.getOrderList();
		
	}
	@PostMapping("/create")
	public ResponseEntity create(@RequestBody OrderDto dto)
	{
		return figen.createOrder(dto);
		
	}
	@PostMapping("/update")
public OrderDto updateOrder(@RequestBody OrderDto dto)
	{
		return figen.getAllByPOstReq(dto);

}
}
