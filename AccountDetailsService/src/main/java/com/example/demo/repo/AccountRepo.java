package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.dao.AccountEntity;

public interface AccountRepo extends JpaRepository<AccountEntity, Long>
{
@Query("select a.acno from AccountEntity a where a.phone=?1")	
public long findAccByPhone(long phone);
}
