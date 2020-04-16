package com.example.demo.service;

import com.example.demo.dao.AmountTransferDao;
import com.example.demo.dao.GetAccountDetailsEntity;
import com.example.demo.dao.TransferResponseDao;

public interface AccountDetais {
//public	GetAccountDetailsEntity getAccount(long phone) ;
	TransferResponseDao amountTransferService(AmountTransferDao dto);
 public void upDateBalFromSer(AmountTransferDao dao);
}
