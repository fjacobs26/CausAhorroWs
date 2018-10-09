package com.bancos.sample.CausAhorroWs.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.bancos.sample.CausAhorroWs.Model.AccountGeneralServices;
import com.bancos.sample.CausAhorroWs.Repository.AccountGeneralServicesRepository;
@Service("accountGeneralServicesSerivceImpl")
public class AccountGeneralServicesSerivceImpl implements AccountGeneralServicesService{

	@Autowired
	@Qualifier("accountGeneralServicesRepository")
	private AccountGeneralServicesRepository accountGeneralServicesRepository;
	
	@Override
	public List<AccountGeneralServices> findAll() {
		return accountGeneralServicesRepository.findAll();
	}

}
