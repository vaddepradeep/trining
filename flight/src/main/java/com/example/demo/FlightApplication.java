package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;

import com.example.demo.controller.UserControlller;

@SpringBootApplication(exclude = HibernateJpaAutoConfiguration.class)
public class FlightApplication implements CommandLineRunner {
	@Autowired
	private UserControlller usercontroller;

	public static void main(String[] args) {
		SpringApplication.run(FlightApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		//UserDto udto= new UserDto();
		//udto.setUsername("pradeep");
		//udto.setPwd("pradeep");
		//usercontroller.createUser(udto);
		//usercontroller.findUser(udto);
		
		
	//List flightlist=usercontroller.findFlights();
	//System.out.println(flightlist);
	}

}
