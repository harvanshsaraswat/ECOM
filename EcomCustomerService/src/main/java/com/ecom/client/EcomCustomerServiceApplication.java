package com.ecom.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class EcomCustomerServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EcomCustomerServiceApplication.class, args);
	}

}
