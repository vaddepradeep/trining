package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.dao.AccountEntity;

public interface AccountRepo extends JpaRepository<AccountEntity, Long>
{
@Query("select a.acno from AccountEntity a where a.phone=?1")	
public boolean  findAccByPhone(long phone);

@Query("select a.bal from AccountEntity a where a.phone=?1")
double checkAccountBal(long phone);

@Query("update AccountEntity a set a.bal=?2 where a.phone=?1")
void upDateBalFrom(long no,double bal);

}
