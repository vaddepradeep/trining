package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.AccRegDao;
import com.example.demo.dao.AccRegResDao;
import com.example.demo.dao.AccountDao;
import com.example.demo.repo.AccountRepo;
@Service
public class RegServiceImpl implements Regservice{
	@Autowired
	private AccountRepo arepo;
	@Autowired
	private RandomCardDetailsService rser;

	@Override
	public AccRegResDao doRegistration(AccRegDao dao) {
		AccRegResDao resdao= new AccRegResDao();
		String adao=arepo.checkAccount(dao.getPhono());
		if(!"".equals(adao) && adao!=null)
		
		{
			resdao.setSmsg("account alredyExisit");
			resdao.setStatusCode(701);
			return resdao;
		}
		else
		{
			AccountDao dao1= new AccountDao();
			dao1.setAccno(rser.genAccountNumber());
			dao1.setPhno(dao.getPhono());
			dao1.setCardno(rser.genCardNumber());
			dao1.setCvv(rser.genCvv());
			dao1.setBal(10000);
			dao1.setName(dao.getUname());
			arepo.save(dao1);
			resdao.setStatusCode(200);
			resdao.setSmsg("account successfully created");
			return resdao;
		}
		
	}

}
