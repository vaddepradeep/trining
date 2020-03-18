package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.ResponseStatusDao;
import com.example.demo.dao.UserDao;
import com.example.demo.repo.UserRepo;

/*@Service
public class UserService {
	@Autowired
	private UserRepo userrepo;
	
	public ResponseStatusDao createUser(UserDao dao)
	{
		ResponseStatusDao resdao= new ResponseStatusDao();
	boolean b=userrepo.existsById(dao.getUid());
	if(b) {
		resdao.setErrorcode(701);
		resdao.setErrormsg("user alredy exsist");
		return resdao;
	}
	else
	{
		
		userrepo.save(dao);
		resdao.setErrorcode(200);
		resdao.setErrormsg("user successfully created");
		return resdao;
	}
	}

public UserDao findUser(UserDao dao)
{
	return userrepo.findByUsernameAndPwd(dao.getUsername(), dao.getPwd()) ;
	
}

}*/

