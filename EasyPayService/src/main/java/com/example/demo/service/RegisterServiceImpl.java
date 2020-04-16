package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.dao.RegisterDao;
import com.example.demo.dao.TransferResponseDao;
import com.example.demo.feign.DemoFeign;
import com.example.demo.repo.RegiterRepo;

public class RegisterServiceImpl implements RegiserService {
	@Autowired
private RegiterRepo repo;
	private DemoFeign feignser;
	@Override
	public TransferResponseDao doRigegister(RegisterDao dao) {
		boolean b=repo.existsById(dao.getPhone());
		TransferResponseDao resdao= new TransferResponseDao();
		if(b)
		{
			resdao.setTcode(801);
			resdao.setMsg("user alredy their");
			return resdao;
		}
		else
		{
			repo.save(dao);
		resdao.setMsg("successfully rigister");
		resdao.setTcode(200);
		return resdao;
		}
	}
	public boolean checkStatusService(long phone) {
		boolean b=repo.existsById(phone);
		return b;
	}
	}


