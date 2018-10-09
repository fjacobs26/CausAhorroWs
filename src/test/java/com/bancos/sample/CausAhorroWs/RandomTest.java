package com.bancos.sample.CausAhorroWs;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class RandomTest {
	public static void accountRandom() {
		BigDecimal prueba = new BigDecimal("890.55");
		int randomIndex = 4;
		double acum = 0;
		List<Double> getAcum = new ArrayList<Double>();
		double totalAmmount = Double.parseDouble(prueba.toString());
		for (int i = 0; i < randomIndex; i++) {
			double randomValues= (Math.random() * ((650 - 1) + 1)) + 1;
			acum +=randomValues;
			if(acum<=totalAmmount) {
				getAcum.add(randomValues);
			}else {
				double newValue = acum - totalAmmount;
				double newValue_ = randomValues - newValue;
				acum-=randomValues;
				acum+=newValue_;
				getAcum.add(newValue_);
				return;
			}
		}
	}
	
	
	public static void main(String[] args) {
		accountRandom();
	}
}
