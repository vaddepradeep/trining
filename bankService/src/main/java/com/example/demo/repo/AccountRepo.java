package com.example.demo.repo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.dao.AccountDao;

public interface AccountRepo extends JpaRepository<AccountDao, Long> {
	@Query(value = "select a.name from AccountDao a where a.phno=1")
	String checkAccount(long phone);
	@Query(value = "select a.bal from AccountDao a where a.cardno=1")
double  checkBal(long cno );
	@Query(value = "update AccountDao a set a.bal=1 where  a.cardno=2 ")
	void updateBal(double d,long caadno);
}
