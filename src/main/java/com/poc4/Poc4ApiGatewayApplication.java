package com.poc4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Poc4ApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(Poc4ApiGatewayApplication.class, args);
	}

}
