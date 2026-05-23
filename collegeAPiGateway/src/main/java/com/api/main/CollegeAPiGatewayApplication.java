package com.api.main;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class CollegeAPiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(CollegeAPiGatewayApplication.class, args);
	}

}
