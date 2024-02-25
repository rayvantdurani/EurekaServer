package com.serviceDiscovery.EurekaServerBankingApplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServerBankingApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServerBankingApplication.class, args);
	}

}
