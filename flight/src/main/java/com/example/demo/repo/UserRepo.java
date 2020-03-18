package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.dao.UserDao;

@Repository
public interface UserRepo  extends JpaRepository<UserDao, Integer>{
	UserDao findByUsernameAndPwd(String username, String pwd);
	@Query(value = "select uid  from user wherre uname=? and pwd",nativeQuery = true)
	public int findId(String uuname, String pwd);
	
	

}
