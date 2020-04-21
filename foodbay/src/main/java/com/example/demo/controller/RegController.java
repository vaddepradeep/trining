package com.example.demo.controller;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Dao.LoginDao;
import com.example.demo.Dao.LoginResDao;
import com.example.demo.Dao.RegistrationDao;
import com.example.demo.Dao.RegresDao;
import com.example.demo.dto.LoginDto;
import com.example.demo.dto.LoginResDto;
import com.example.demo.dto.RegistrationDto;
import com.example.demo.dto.RegresDto;
import com.example.demo.service.RegServiceImpl;

@RestController
public class RegController {
	@Autowired
	private  RegServiceImpl service;
	
	@RequestMapping(value="/doreg",method = RequestMethod.POST,consumes = "application/json")
	public RegresDto doRegistration(@RequestBody RegistrationDto dto)
	{
		RegistrationDao dao= new RegistrationDao();
		BeanUtils.copyProperties(dto, dao);
		RegresDao resdao=service.doRegService(dao);
		RegresDto resdto= new RegresDto();
		BeanUtils.copyProperties(resdao, resdto);
		
		return resdto;
		
	}
	@RequestMapping(value="/dologin",method = RequestMethod.POST,consumes = "application/json")
public LoginResDto doLogin(@RequestBody LoginDto dto)
{
	LoginDao dao=new LoginDao(); 
	BeanUtils.copyProperties(dto, dao);
	LoginResDao lresdao=service.doLoginService(dao);
	//RegresDto resdto= new RegresDto();
	LoginResDto lresdto= new LoginResDto();
	
	BeanUtils.copyProperties(lresdao, lresdto);
	
	return lresdto;
	
}
}
