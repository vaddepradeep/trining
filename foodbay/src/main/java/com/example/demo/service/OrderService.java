package com.example.demo.service;

import com.example.demo.Dao.OrderDao;
import com.example.demo.Dao.OrderResStatusDao;

public interface OrderService {
	public OrderResStatusDao processOrderService(OrderDao dao);
	

}
