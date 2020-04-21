package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.Dao.MenuDao;

public interface MenuRepo extends JpaRepository<MenuDao, Integer>{
	
@Query(value = "select m.price from MenuDao m where m.itemid=1")
	double findPrice(int itemid);
	

}
