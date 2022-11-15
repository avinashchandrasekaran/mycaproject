package com.example.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
@EnableEurekaClient
@SpringBootApplication
public class BackendTouristApplication {

	public static void main(String[] args) {
		SpringApplication.run(BackendTouristApplication.class, args);
	}

}
