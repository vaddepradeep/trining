package com.example.demo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.dao.FlightDao;

@Repository
public interface FlightRepo extends JpaRepository<FlightDao, Long> {
	public List<FlightDao> findBysourceAndDestination(String source,String destination); 
	
	
	

}
