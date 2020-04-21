package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.Dao.MenuDao;
import com.example.demo.Dao.OrderInfoDao;
import com.example.demo.repo.OrderInfoRepo;
import com.example.demo.repo.Regrepo;

public class OrderInfoSerImpl implements OrderInfo {
	@Autowired
private OrderInfoRepo orepo;
	@Autowired
	private Regrepo regrepo;
	@Override
	public void saveOrderInfo(MenuDao dao,long phone) {
		OrderInfoDao odao= new OrderInfoDao();
		String pleacedby=regrepo.findUsername(phone);
		odao.setPhone(phone);
		odao.setPlacedby(pleacedby);
		odao.setAmount(dao.getPrice());
		odao.setOname(dao.getIname());
		odao.setStatus("pending");
		orepo.save(odao);
	}

}
