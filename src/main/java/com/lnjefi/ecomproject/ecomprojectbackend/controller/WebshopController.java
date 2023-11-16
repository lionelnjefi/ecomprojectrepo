package com.lnjefi.ecomproject.ecomprojectbackend.controller;

import com.lnjefi.ecomproject.ecomprojectbackend.model.Product;
import com.lnjefi.ecomproject.ecomprojectbackend.service.ProductService;
import com.lnjefi.ecomproject.ecomprojectbackend.service.ValidationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class WebshopController {

	@Autowired
	ProductService productService;
	ValidationService validationService;

	@GetMapping("/products")
	@ResponseBody
	public List<Product> homepage() {
		return productService.listProducts();
	}

	@GetMapping("/cart")
	public String shoppingCart(){
		return "This is your shopping Cart";
	}

	public Boolean validatePassweor(String password){
		return validationService.validatePassword(password);
	}
}
