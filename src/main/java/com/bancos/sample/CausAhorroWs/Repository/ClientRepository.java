package com.bancos.sample.CausAhorroWs.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bancos.sample.CausAhorroWs.Model.Client;
@Repository("clientRepository")
public interface ClientRepository extends JpaRepository<Client, Long>{

}
