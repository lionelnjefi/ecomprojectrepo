package com.lnjefi.ecomproject.ecomprojectbackend.service;

import com.lnjefi.ecomproject.ecomprojectbackend.dto.CartDto;
import com.lnjefi.ecomproject.ecomprojectbackend.model.Product;
import com.lnjefi.ecomproject.ecomprojectbackend.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public List<Product> listProducts(){
        return productRepository.findAll();
    }

}
