package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServerSideServiceController {

	@RequestMapping(value = "/getService2", method = RequestMethod.GET)
	public String getService2() {

		return "SpringCloud-Zuul-Api-Gateway-Service2 Called";
	}
}