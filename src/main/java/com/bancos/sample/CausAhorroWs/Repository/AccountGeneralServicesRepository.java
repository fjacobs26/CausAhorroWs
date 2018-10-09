package com.bancos.sample.CausAhorroWs.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bancos.sample.CausAhorroWs.Model.AccountGeneralServices;
@Repository("accountGeneralServicesRepository")
public interface AccountGeneralServicesRepository extends JpaRepository<AccountGeneralServices, Long>{

}
