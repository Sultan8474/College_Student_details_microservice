package com.api.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class StudentWebServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentWebServiceApplication.class, args);
	}

}
