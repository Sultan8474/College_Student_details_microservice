package com.api.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class CollegeEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CollegeEurekaServerApplication.class, args);
	}

}
