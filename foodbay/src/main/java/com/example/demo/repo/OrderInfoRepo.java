package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Dao.OrderInfoDao;

public interface OrderInfoRepo extends JpaRepository<OrderInfoDao, Integer>{

}
