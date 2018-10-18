package com.bancos.sample.CausAhorroWs.Model.commons;

import java.math.BigDecimal;
import java.security.SecureRandom;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.bancos.sample.CausAhorroWs.Model.Account;
import com.bancos.sample.CausAhorroWs.Model.AccountGeneralServices;
import com.bancos.sample.CausAhorroWs.Model.Client;

public class Commons {

	private static final SecureRandom random = new SecureRandom();

	public static <T extends Enum<?>> T randomEnum(Class<T> clazz) {
		int x = random.nextInt(clazz.getEnumConstants().length);
		return clazz.getEnumConstants()[x];
	}

	public static AccountGeneralServices getRandomGeneralService(List<AccountGeneralServices> listado) {
		int random = (int) (Math.random() * ((listado.size() - 1 - 0) + 1)) + 0;
		return listado.get(random);
	}
	
	public static Account getRandomAccount(List<Account> listado) {
		int random = (int) (Math.random() * ((listado.size() - 1 - 0) + 1)) + 0;
		return listado.get(random);
	}
	
	public static Client getRandomClient(List<Client> listado) {
		int random = (int) (Math.random() * ((listado.size() - 1 - 0) + 1)) + 0;
		return listado.get(random);
	}

	public static List<Object> getAccounts() {
		double result = (Math.random() * ((7000 - 1000) + 1)) + 1000;
		int registryCode = (int) (Math.random() * ((99999999 - 10000000) + 1)) + 10000000;
		int bankNumber = (int) (Math.random() * ((999999 - 100000) + 1)) + 100000;
		String balance = String.format("%.2f", result);
		String retencion = String.format("%.2f", Commons.generateRetention(result));
		balance = balance.replace(",", ".");
		retencion = retencion.replace(",", ".");
		List<Object> accountValues = new ArrayList<Object>();
		accountValues.add(registryCode);
		accountValues.add(bankNumber);
		accountValues.add(balance);
		accountValues.add(retencion);
		return accountValues;
	}

	public static int createRandomIntBetween(int start, int end) {
		return start + (int) Math.round(Math.random() * (end - start));
	}

	public static LocalDate createRandomDate(int startYear, int endYear) {
		int day = createRandomIntBetween(1, 28);
		int month = createRandomIntBetween(1, 12);
		int year = createRandomIntBetween(startYear, endYear);
		return LocalDate.of(year, month, day);
	}

	public static double generateRetention(double result) {
		double resulRetention = 0;
		if (result < 2000) {
			resulRetention = (Math.random() * ((400 - 40) + 1)) + 40;
		} else if (result >= 2000 && result <= 4000) {
			resulRetention = (Math.random() * ((800 - 40) + 1)) + 40;
		} else if (result > 4000) {
			resulRetention = (Math.random() * ((1600 - 40) + 1)) + 40;
		}
		return resulRetention;
	}

	public static BigDecimal getAmountTransaction(BigDecimal retention, BigDecimal aux) {
		double acum = Double.parseDouble(aux.toString());
		BigDecimal getAcum = new BigDecimal("0.00");
		double totalAmount = Double.parseDouble(retention.toString());
		double randomValues = (Math.random() * ((450 - 1) + 1)) + 1;
		
		if (randomValues <= totalAmount) {
			getAcum = new BigDecimal(randomValues);
			return getAcum;
		} else {
			double newValue = acum + randomValues;
			double newValue_ = newValue-totalAmount;
			getAcum = new BigDecimal(randomValues - newValue_);
			return getAcum;
		}
	}
}
