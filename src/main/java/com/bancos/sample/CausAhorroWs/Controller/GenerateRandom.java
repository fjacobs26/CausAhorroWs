package com.bancos.sample.CausAhorroWs.Controller;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bancos.sample.CausAhorroWs.Model.Account;
import com.bancos.sample.CausAhorroWs.Model.Transaction;
import com.bancos.sample.CausAhorroWs.Service.AccountService;

@RestController
@RequestMapping("/v1")
public class GenerateRandom {
	   
	@Autowired
	@Qualifier("accountService")
	private AccountService accountService;
    
    @GetMapping("/transaction")
    public List<Transaction> obtenerTransaccion() {
    	return null;
    }
        
}
