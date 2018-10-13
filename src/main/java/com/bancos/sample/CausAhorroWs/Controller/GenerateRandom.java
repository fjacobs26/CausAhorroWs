package com.bancos.sample.CausAhorroWs.Controller;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.Random;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bancos.sample.CausAhorroWs.Model.Account;
import com.bancos.sample.CausAhorroWs.Model.AccountGeneralServices;
import com.bancos.sample.CausAhorroWs.Model.Client;
import com.bancos.sample.CausAhorroWs.Model.Transaction;
import com.bancos.sample.CausAhorroWs.Model.commons.Commons;
import com.bancos.sample.CausAhorroWs.Model.enums.AccountType;
import com.bancos.sample.CausAhorroWs.Model.enums.BankIdentifier;
import com.bancos.sample.CausAhorroWs.Model.enums.MoneyValues;
import com.bancos.sample.CausAhorroWs.Model.enums.RegistryType;
import com.bancos.sample.CausAhorroWs.Model.enums.TransactionType;
import com.bancos.sample.CausAhorroWs.Service.AccountGeneralServicesService;
import com.bancos.sample.CausAhorroWs.Service.AccountService;
import com.bancos.sample.CausAhorroWs.Service.ClientService;
import com.bancos.sample.CausAhorroWs.Service.TransactionService;

@RestController
@RequestMapping("/v1")
public class GenerateRandom {

	@Autowired
	@Qualifier("accountServiceImpl")
	private AccountService accountService;

	@Autowired
	@Qualifier("clientServiceImpl")
	private ClientService clientService;

	@Autowired
	@Qualifier("transactionServiceImpl")
	private TransactionService transactionService;

	@Autowired
	@Qualifier("accountGeneralServicesSerivceImpl")
	private AccountGeneralServicesService accountGeneralServicesSerivce;

	@Scheduled(fixedRate = 2000)
	public void accountRandom() {
		Account account = new Account(
				"" + RegistryType.values()[new Random().nextInt(RegistryType.values().length)].getDetalle(),
				"" + Commons.getAccounts().get(0),
				"4" + BankIdentifier.values()[new Random().nextInt(BankIdentifier.values().length)].getDetalle()
						+ Commons.getAccounts().get(1),
				"" + MoneyValues.values()[new Random().nextInt(MoneyValues.values().length)].getDetalle(),
				"" + AccountType.values()[new Random().nextInt(AccountType.values().length)].getDetalle(),
				new BigDecimal("" + Commons.getAccounts().get(2)), new BigDecimal("" + Commons.getAccounts().get(3)),
				Commons.getRandomClient(clientService.findAll()));//
		accountService.save(account);
		System.out.println(account.getClient().getUsername());
	}
	@Scheduled(cron = "59 * * * * *")
	public void TransactionRandom() {
		List<Account> listAllAccounts = accountService.findAll();
		for (Account account : listAllAccounts) {
			Transaction transaction = new Transaction(
					java.sql.Date.valueOf(Commons.createRandomDate(2015, 2018)),
					Commons.getAmountTransaction(account.getActualRetention()), account.getCoinType(), 
					"",
					Math.random() < 0.5,
					TransactionType.values()[new Random().nextInt(TransactionType.values().length)].getDetalle(),
					Commons.getRandomGeneralService(accountGeneralServicesSerivce.findAll()),
					"",
					account,
					account.getClient());
			transactionService.save(transaction);
		}
		
	}

	@PutMapping("/client")
	public boolean agregarCliente(@RequestBody @Valid Client cliente) {
		return clientService.save(cliente);
	}

	@GetMapping("/listClient")
	public List<Client> listarClientes() {
		return clientService.findAll();
	}

	@GetMapping("/listTransaction")
	public List<Transaction> obtenerTransaccion() {
		return transactionService.findAll();
	}

	@GetMapping("/listAccount")
	public List<Account> obtenerCuentas() {
		return accountService.findAll();
	}
}