package com.bancos.sample.CausAhorroWs.Repository;

import java.math.BigDecimal;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.bancos.sample.CausAhorroWs.Model.Account;
@Repository("accountRepository")
public interface AccountReposiroty extends JpaRepository<Account, Long>{
	@Query("select a.actualRetention from Account a")
	public BigDecimal getRetention();
}
