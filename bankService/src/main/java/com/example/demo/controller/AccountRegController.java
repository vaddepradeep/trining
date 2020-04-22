package com.example.demo.controller;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.AccRegDao;
import com.example.demo.dao.AccRegResDao;
import com.example.demo.dto.AccRegDto;
import com.example.demo.dto.AccRegResDto;
import com.example.demo.service.RegServiceImpl;

@RestController
public class AccountRegController {
	@Autowired
	private RegServiceImpl rsimpl;
	@RequestMapping(value = "/doreg",method = RequestMethod.POST,consumes = "application/json")
	AccRegResDto doReg(@RequestBody AccRegDto dto)
	{
		AccRegDao dao= new AccRegDao();
		BeanUtils.copyProperties(dto, dao);
		AccRegResDao resdao=rsimpl.doRegistration(dao);
		AccRegResDto resdto= new AccRegResDto();
		BeanUtils.copyProperties(resdao, resdto);
	return	resdto;
		
		
		
	}

}
