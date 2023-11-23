package com.lnjefi.ecomproject.ecomprojectbackend.controller;

import com.lnjefi.ecomproject.ecomprojectbackend.model.Product;
import com.lnjefi.ecomproject.ecomprojectbackend.service.ProductService;
import com.lnjefi.ecomproject.ecomprojectbackend.service.ValidationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class WebshopController {

	@Autowired
	ProductService productService;
	@Autowired
	ValidationService validationService;

	@GetMapping("/products")
	@ResponseBody
	public ResponseEntity<List<Product>> getProducts(@RequestParam(required = false) String productName){
		try {
			List<Product> products = new ArrayList<Product>();

			if (productName == null)
				productService.listProducts().forEach(products::add);
			else
				productService.getProductsByName(productName).forEach(products::add);

			if (products.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}

			return new ResponseEntity<>(products, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}

	}

	@GetMapping("/products/{id}")
	public ResponseEntity<Product> getTutorialById(@PathVariable("id") long id) {
		Optional<Product> productData = productService.getProductById(id);

		if (productData.isPresent()) {
			return new ResponseEntity<>(productData.get(), HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	@PostMapping("/products")
	public ResponseEntity<Product> createTutorial(@RequestBody Product product) {
		try {
			productService.saveProduct(product);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	@GetMapping("/cart")
	public String shoppingCart(){
		return "This is your shopping Cart";
	}

	public Boolean validatePassword(String password){
		return validationService.validatePassword(password);
	}
}
