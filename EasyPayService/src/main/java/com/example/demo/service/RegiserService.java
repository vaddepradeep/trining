package com.example.demo.service;

import com.example.demo.dao.RegisterDao;
import com.example.demo.dao.TransactinDao;
import com.example.demo.dao.TransferResponseDao;

public interface RegiserService {
	 TransferResponseDao doRigegister(RegisterDao dao);
	// void updateTransaction(TransactinDao dao);
	
}