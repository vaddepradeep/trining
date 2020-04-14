package com.example.demo.feign;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.dto.OrderDto;

@FeignClient(name="http://ORDERSERVICE/orders")
public interface DemoFeign {
	@RequestMapping("/list")
	public List  getOrderList();
	
	 @RequestMapping(value = "/create",method = RequestMethod.POST)
	 public ResponseEntity<String> createOrder(@RequestBody OrderDto dto);
	 
	 @PostMapping("/update")
		public  OrderDto getAllByPOstReq(@RequestBody OrderDto dto);
	 
	 @RequestMapping("/{id}")
	 public OrderDto getOrder(@PathVariable("id") int id);

}
