package com.munshi.rest.webservices.restfulwebservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

//import com.munshi.rest.webservices.restfulwebservices.config.VaultImpl;

@SpringBootApplication
public class RestfulWebServicesApplication {

	public static void main(String[] args) {
		
		/*
		 * VaultImpl vaultImpl = new VaultImpl(); vaultImpl.writeSecrets();
		 * vaultImpl.readSecrets();
		 */
		
		SpringApplication.run(RestfulWebServicesApplication.class, args);
	}

}
