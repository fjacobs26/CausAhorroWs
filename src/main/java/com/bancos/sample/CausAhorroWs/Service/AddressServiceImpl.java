package com.bancos.sample.CausAhorroWs.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.bancos.sample.CausAhorroWs.Model.Address;
import com.bancos.sample.CausAhorroWs.Repository.AddressRepository;
@Service("addressServiceImpl")
public class AddressServiceImpl implements AddressService{

	@Autowired
	@Qualifier("addressRepository")
	private AddressRepository addressRepository;
	
	@Override
	public List<Address> findAll() {
		return addressRepository.findAll();
	}

}
