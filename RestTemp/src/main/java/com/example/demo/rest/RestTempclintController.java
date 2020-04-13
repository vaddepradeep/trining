/*package com.example.demo.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.demo.dto.OrderDto;
@RestController
public class RestTempclintController {
	@Autowired
	RestTemplate rt;
@RequestMapping("/")	
public List getAlllist()
{
	
	String uri="http://ORDERSERVICE/list" ;
	ArrayList al=rt.getForObject(uri, ArrayList.class);
	System.out.println(al);
	return al;
}





@RequestMapping("list/{uid}")
public String getOrderById(@PathVariable("uid") int uid)
{
String uri="http://localhost:8080/"+ "uid";
String s=rt.getForObject(uri, String.class);
return s;

}

@RequestMapping("/order")
public ResponseEntity newOrder()
{
	String uri="http://localhost:8080/create";
	OrderDto dto= new OrderDto(4, "bat", "mrf");
	ResponseEntity  re=rt.postForEntity(uri, dto, ResponseEntity.class);
	return re;
}
}
*/