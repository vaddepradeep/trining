package com.example.demo.service;

import com.example.demo.dao.AccRegDao;
import com.example.demo.dao.AccRegResDao;
import com.example.demo.dto.AccRegResDto;

public interface Regservice {
	public AccRegResDao doRegistration(AccRegDao dao);

}
