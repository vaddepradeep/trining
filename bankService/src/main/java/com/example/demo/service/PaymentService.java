package com.example.demo.service;

import com.example.demo.dao.PaymentDao;
import com.example.demo.dao.PaymentResDao;

public interface PaymentService {
	PaymentResDao doPaymentSer(PaymentDao dao);
	

}
