package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Dao.VendorDao;

public interface VendorRepo  extends JpaRepository<VendorDao, Integer>{

}
