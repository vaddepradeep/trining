package com.example.demo.repo;

import javax.persistence.criteria.CriteriaBuilder.In;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.dao.TransactinDao;

public interface TransactionRepo  extends JpaRepository<TransactinDao, Integer>

}
