package com.micoservice.apigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MicroserviceApigatewayServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceApigatewayServiceApplication.class, args);
	}

}
