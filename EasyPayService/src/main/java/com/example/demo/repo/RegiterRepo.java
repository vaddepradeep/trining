package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.dao.RegisterDao;

public interface RegiterRepo extends JpaRepository<RegisterDao, Long>{

}
