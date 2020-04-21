package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Dao.LoginDao;
import com.example.demo.Dao.LoginResDao;
import com.example.demo.Dao.RegistrationDao;
import com.example.demo.Dao.RegresDao;
import com.example.demo.Dao.VendorDao;
import com.example.demo.repo.Regrepo;
import com.example.demo.repo.VendorRepo;

@Service
public class RegServiceImpl implements RegService {
	@Autowired
	private Regrepo regrepo;
	@Autowired
	private VendorRepo vrepo;

	RegresDao resdao = new RegresDao();
	LoginResDao lresdao= new LoginResDao();
	
	@Override
	public RegresDao doRegService(RegistrationDao dao) {
	boolean b=regrepo.existsById(dao.getPhno());
	if(b)
	{
		resdao.setErrorcode(601);
		resdao.setErrormsg("user aredy exist");
		return resdao;
	}
	else
	{
		regrepo.save(dao);
		resdao.setErrorcode(200);
		resdao.setErrormsg("successfully registered");
		return resdao;	
	}
	
		
	}
	@Override
	public LoginResDao doLoginService(LoginDao dao) {
		boolean b=regrepo.existsById(dao.getPhno());
		if(b)
		{
			lresdao.setErrorcode(200);
			lresdao.setErrormsg("successfully login");
			List<VendorDao> vlist=vrepo.findAll();
			lresdao.setVendors(vlist);
			return lresdao;
		}
		else
		{
			resdao.setErrorcode(602);
			resdao.setErrormsg("bad cridentials");
			return lresdao;
		}
		
	}

}
