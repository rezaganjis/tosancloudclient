package com.tosan;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(Credential.class)

public class TosanVaultCloudClientApplication implements CommandLineRunner {
	Logger LOG = LoggerFactory.getLogger(TosanVaultCloudClientApplication.class);

	@Autowired
	private  Credential credential;
	
	public static void main(String[] args) {
		SpringApplication.run(TosanVaultCloudClientApplication.class, args);
	}

	
	
	@Override
	public void run(String... args) throws Exception {
		LOG.info("username: " + credential.getUsername());
		LOG.info("password: " + credential.getPassword());
	}
}