package com.lnjefi.ecomproject.ecomprojectbackend;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeToEcomProject {

	@GetMapping("/Welcome")
	public String springStarter() {
		return "Ecom Springboot project is on port: 8080";
	}
}
