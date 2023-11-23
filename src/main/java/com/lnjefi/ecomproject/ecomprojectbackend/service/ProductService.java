package com.lnjefi.ecomproject.ecomprojectbackend.service;

import com.lnjefi.ecomproject.ecomprojectbackend.dto.CartDto;
import com.lnjefi.ecomproject.ecomprojectbackend.model.Product;
import com.lnjefi.ecomproject.ecomprojectbackend.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public List<Product> listProducts(){
        return productRepository.findAll();
    }

    public List<Product> getProductsByName(String productName){
        return productRepository.findByProductName(productName);
    }

    public Optional<Product> getProductById(long id){
        return productRepository.findById(id);
    }

    public ResponseEntity<Product> saveProduct(Product product){
        Product _product = productRepository
                .save(new Product(product.getProductName(), product.getProductDescription(), product.getProductPrice(),product.getProductQuantity()));
        return new ResponseEntity<>(_product, HttpStatus.CREATED);
    }

}
