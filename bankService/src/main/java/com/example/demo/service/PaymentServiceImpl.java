package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.PaymentDao;
import com.example.demo.dao.PaymentResDao;
import com.example.demo.repo.AccountRepo;

@Service
public class PaymentServiceImpl  implements PaymentService{
	@Autowired
	private AccountRepo acrepo;

	@Override
	public PaymentResDao doPaymentSer(PaymentDao dao) {
		PaymentResDao resdao= new PaymentResDao(); 
		double bal=acrepo.checkBal(dao.getCardno());
		if(bal==0)
		{
			resdao.setPcode(801);
			resdao.setPmsg("invallid card details");
			return resdao;
		}
		else if(bal<dao.getAmt())
		{
			resdao.setPcode(802);
			resdao.setPmsg("in sufficient balance");
		return resdao;	
		}
		else
		{
			updateBal(dao);
		resdao.setPcode(200);
		resdao.setPmsg("order placed successfully");
		return resdao;
		}
	}
		public void updateBal(PaymentDao dao)
		{
			double bal=acrepo.checkBal(dao.getCardno());
			double finalbal=bal-dao.getAmt();
			acrepo.updateBal(finalbal, dao.getCardno());
		}
	}


