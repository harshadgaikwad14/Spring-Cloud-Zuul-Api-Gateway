package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringCloudZuulApiGatewayServiceApplication {

	
	/*
	 * Service2 Url : http://localhost:8888/getService8
	 */
	
	public static void main(String[] args) {
		SpringApplication.run(SpringCloudZuulApiGatewayServiceApplication.class, args);
	}
}
