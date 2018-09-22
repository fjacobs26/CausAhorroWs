package com.bancos.sample.CausAhorroWs.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bancos.sample.CausAhorroWs.Model.Commons.Client;

@RestController
public class GenerateRandom {
	
    @RequestMapping("/client")
    public Client client(@RequestParam(value="cliente", defaultValue="World") String name) {
    	
    	return null;
    }
	
}
