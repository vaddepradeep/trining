package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.FindFlightsDao;
import com.example.demo.dao.FlightDao;
import com.example.demo.dao.ResponseStatusDao;
import com.example.demo.repo.FlightRepo;

/*@Service
public class FlightServiceImpl implements FlightService {
	@Autowired
	private FlightRepo flightrepo;
	@Override
	public ResponseStatusDao cteateFlight(FlightDao dao)
	{
		boolean b=flightrepo.existsById(dao.getFlightid());
		ResponseStatusDao dres= new ResponseStatusDao();
		if(b)
		{
			dres.setErrorcode(601);
			dres.setErrormsg("flight alredy exsits");
			return dres;
		}
		else
		{
			flightrepo.save(dao);
			dres.setErrorcode(200);
			dres.setErrormsg("flight added successfully");
			return dres;
		}
	}
	@Override
	public List<FindFlightsDao> findFlight(String source, String destination) {
List l=flightrepo.findBysourceAndDestination(source, destination);
if (l!=null)
{
	return l;
}
else
{
	ResponseStatusDao  dao= new ResponseStatusDao();
	dao.setErrorcode(801);
	dao.setErrormsg("flights not found");
	List list= new ArrayList();
	l.add(dao);
	return list;
	
	} 
	
		
}
	}
	
*/

