package com.bancos.sample.CausAhorroWs.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import com.bancos.sample.CausAhorroWs.Model.Transaction;
@Repository("transactionRepository")
public interface TransactionRepository extends JpaRepository<Transaction, Long>, JpaSpecificationExecutor<Transaction>{
	
}
