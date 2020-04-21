package com.example.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Dao.MenuDao;
import com.example.demo.Dao.OrderDao;
import com.example.demo.Dao.OrderResStatusDao;
import com.example.demo.repo.MenuRepo;

@Service
public class OrderServiceImpl implements OrderService {
	@Autowired
	private MenuRepo menu;
	@Autowired
	private OrderInfoSerImpl oinfo;

	@Override
	public OrderResStatusDao processOrderService(OrderDao dao) {
		OrderResStatusDao resdao= new OrderResStatusDao();
	boolean b=	menu.existsById(dao.getItemid());
	if(b)
	{
		long phone= dao.getPhone();
		
		double l=menu.findPrice(dao.getItemid());
	Optional<MenuDao> opt=menu.findById(dao.getItemid());
	MenuDao dao2=opt.get();
	oinfo.saveOrderInfo(dao2,phone);
	
		resdao.setScode(200);
		resdao.setSmsg("pay"+l+" to place the order ");
		
		return resdao;
	}
	else
	{
		resdao.setScode(603);
		resdao.setSmsg("item not found please try again");
		return resdao;
	}
	
	

}
}
