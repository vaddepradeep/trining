package com.example.demo.conf;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.dto.PamentDto;
import com.example.demo.dto.PaymentResDto;

@FeignClient(name="(name=\"http://BankSERVICEICE")
public interface DemoFeign {
	@RequestMapping(value = "/payment",method =RequestMethod.POST,consumes = "application/json")
	PaymentResDto doPayment(@RequestBody  PamentDto dto);

}
