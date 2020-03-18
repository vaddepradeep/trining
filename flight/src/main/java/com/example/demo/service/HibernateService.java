package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.FindFlightsDao;
import com.example.demo.dao.FlightDao;
import com.example.demo.dao.ResponseStatusDao;

@Service
public class HibernateService  implements FlightService {
	@Autowired
	private HibernateService hbservice;

	@Override
	public ResponseStatusDao cteateFlight(FlightDao dao) {
		// TODO Auto-generated method stub
		return hbservice.cteateFlight(dao);
	}

	@Override
	public List<FindFlightsDao> findFlight(String source, String destination) {
		// TODO Auto-generated method stub
		return null;
	}

}
