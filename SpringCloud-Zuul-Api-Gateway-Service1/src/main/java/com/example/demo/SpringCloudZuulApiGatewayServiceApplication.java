package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringCloudZuulApiGatewayServiceApplication {
	
	/*
	 * Service1 Url : http://localhost:8887/getService1
	 */
	public static void main(String[] args) {
		SpringApplication.run(SpringCloudZuulApiGatewayServiceApplication.class, args);
	}
}
