package com.bancos.sample.CausAhorroWs.Service;
import com.bancos.sample.CausAhorroWs.Model.Client;
import java.util.List;

public interface ClientService {
	public List<Client> findAll();
	public boolean save(Client client);
	
}
