package com.example.demo.service;

import java.util.List;

import com.example.demo.dao.FindFlightsDao;
import com.example.demo.dao.FlightDao;
import com.example.demo.dao.ResponseStatusDao;

public interface FlightService {
	public ResponseStatusDao cteateFlight(FlightDao dao);
	public List<FindFlightsDao> findFlight(String source,String destination);
	

}
