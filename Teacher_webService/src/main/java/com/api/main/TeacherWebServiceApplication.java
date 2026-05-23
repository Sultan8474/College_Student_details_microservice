package com.api.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class TeacherWebServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(TeacherWebServiceApplication.class, args);
	}

}
