package com.example.demo.repo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.stereotype.Repository;

import com.example.demo.dao.FlightDao;
import com.example.demo.dao.ResponseStatusDao;

@Repository
public class HibernateRepo {
	@Autowired
	private SessionFactory factory;
	Session s=factory.getCurrentSession();
	public ResponseStatusDao createFlight(FlightDao dao)
	{
		boolean b=s.contains(dao);
		if(b)
		{
			ResponseStatusDao resdao= new ResponseStatusDao();
			resdao.setErrorcode(701);
			resdao.setErrormsg("flight alredy exsist");
			return resdao;
		}
		else
		{
			s.save(dao);
			ResponseStatusDao resdao= new ResponseStatusDao();
			resdao.setErrorcode(200);
			resdao.setErrormsg("successfully added");
			return  resdao;
		}
	}

}
