package com.bancos.sample.CausAhorroWs.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.bancos.sample.CausAhorroWs.Model.Client;
import com.bancos.sample.CausAhorroWs.Repository.ClientRepository;

@Service("clientServiceImpl")
public class ClientServiceImpl implements ClientService{

	@Autowired
	@Qualifier("clientRepository")
	private ClientRepository clientRepository;
	
	@Override
	public List<Client> findAll() {
		return clientRepository.findAll();
	}

	@Override
	public boolean save(Client client) {
		try {
			clientRepository.save(client);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		
	}

	@Override
	public Client findById(String username) {
		return clientRepository.findByUsername(username);
	}

}
