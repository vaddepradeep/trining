package com.example.demo.service;

import com.example.demo.Dao.LoginDao;
import com.example.demo.Dao.LoginResDao;
import com.example.demo.Dao.RegistrationDao;
import com.example.demo.Dao.RegresDao;

public interface RegService {
	RegresDao doRegService(RegistrationDao dao);
	LoginResDao doLoginService(LoginDao dao);


}
