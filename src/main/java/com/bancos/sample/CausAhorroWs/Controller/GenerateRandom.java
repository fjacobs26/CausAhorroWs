package com.bancos.sample.CausAhorroWs.Controller;

import java.math.BigDecimal;
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
import com.bancos.sample.CausAhorroWs.Service.AddressService;
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
	@Qualifier("addressServiceImpl")
	private AddressService addressService;

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
		System.out.println("Se agrego una cuenta a: "+account.getClient().getUsername());
	}

	@Scheduled(cron = "0 5 17 * * *")
	public void TransactionRandom() {
		List<Account> listAllAccounts = accountService.findAll();
		BigDecimal aux = new BigDecimal("0.00");
		for (Account account : listAllAccounts) {
			do {
				Transaction transaction = new Transaction(java.sql.Date.valueOf(Commons.createRandomDate(2015, 2018)),
						Commons.getAmountTransaction(account.getActualRetention(), aux), account.getCoinType(), "",
						Math.random() < 0.5,
						TransactionType.values()[new Random().nextInt(TransactionType.values().length)].getDetalle(),
						Commons.getRandomGeneralService(accountGeneralServicesSerivce.findAll()), "", account);

				aux = aux.add(transaction.getAmount());

				aux = aux.setScale(2, BigDecimal.ROUND_HALF_UP);

				transactionService.save(transaction);

			} while (aux.compareTo(account.getActualRetention()) < 0);

		}

	}

	@Scheduled(fixedRate = 150000)
	public void ClientRandom() {
		Random r = new Random();
		Client cliente = null;
		for (int i = 0; i < addressService.findAll().size(); i++) {
			int example = r.nextInt(23142 - 1) + 1;
			cliente= new Client("example" + example + "@causahorro.com", "SDA12312412dSADAS",
					addressService.findAll().get(i));
			clientService.save(cliente);
		}
		System.out.println("Se genero el siguiente cliente:"+cliente.getUsername());
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