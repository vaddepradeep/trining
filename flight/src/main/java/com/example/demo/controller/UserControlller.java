package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.FlightDao;
import com.example.demo.dao.PassigerDao;
import com.example.demo.dao.ResponseStatusDao;
import com.example.demo.dto.FindFlightDto;
import com.example.demo.dto.FlightDto;
import com.example.demo.dto.PassingerDto;
import com.example.demo.dto.ResponseSratusDto;
import com.example.demo.service.HibernateService;

@RestController
public class UserControlller {
	//@Autowired
	//private UserService userservice;
	@Autowired
	//private FlightServiceImpl flightservice;
	private HibernateService flightservice;
	
	
	
	/*@RequestMapping(value = "/create",method = RequestMethod.POST,consumes = "application/json")
	public ResponseSratusDto createUser( @RequestBody UserDto dto)
	{
		UserDao userdao= new UserDao();
		BeanUtils.copyProperties( dto,userdao );
		ResponseStatusDao resdao=userservice.createUser(userdao);
		ResponseSratusDto resdto= new ResponseSratusDto();
		BeanUtils.copyProperties(resdao, resdto);
		return  resdto;
		
	}
	@RequestMapping(value = "/find",method = RequestMethod.GET)
	public void findUser(UserDto udto)
	{
		UserDao udao= new UserDao();
		BeanUtils.copyProperties(udto, udao);
	}*/
	@RequestMapping(value="/createflight",consumes = "application/json")
	public ResponseSratusDto createFlight(@RequestBody FlightDto fdto)
	{
		FlightDao  fdao=new FlightDao(); 
		BeanUtils.copyProperties(fdto, fdao);
		ResponseStatusDao resdao= flightservice.cteateFlight(fdao);
		ResponseSratusDto resdto= new ResponseSratusDto();
		BeanUtils.copyProperties(resdao, resdto);
		return resdto;
		
		
	}
@GetMapping("/airlines")
	public List<FindFlightDto> searchFlights(@RequestParam("source") String source,
            @RequestParam("destination") String destination) 
{
		List l= flightservice.findFlight(source, destination);
		return l;
}
			
	
	@RequestMapping(value="/createpassinger",method = RequestMethod.POST)
	public void createpassinger(@RequestBody PassingerDto dto)
	{
		PassigerDao dao= new PassigerDao();
		BeanUtils.copyProperties(dto, dao);
		//userservice.
	}
	{
		
	}
}
