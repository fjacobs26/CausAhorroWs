package com.bancos.sample.CausAhorroWs.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.bancos.sample.CausAhorroWs.Model.Client;

//
@Repository("clientRepository")
public interface ClientRepository extends CrudRepository<Client, Long>, JpaSpecificationExecutor<Client>, JpaRepository<Client, Long>{
 	@Query("select c from Client c where c.username = :username")
	public Client findByUsername(@Param("username") String username);
}
