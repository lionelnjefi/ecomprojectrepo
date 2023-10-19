package com.lnjefi.ecomproject.ecomprojectbackend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebshopController {

	@GetMapping("/home")
	public String homepage() {
		return "Ecom Springboot project is on port: 8080";
	}

	@GetMapping("/cart")
	public String shoppingCart(){
		return "This is your shopping Cart";
	}
}
