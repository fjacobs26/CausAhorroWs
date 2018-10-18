package com.bancos.sample.CausAhorroWs.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bancos.sample.CausAhorroWs.Model.Address;
@Repository("addressRepository")
public interface AddressRepository extends JpaRepository<Address, Long>{

}
