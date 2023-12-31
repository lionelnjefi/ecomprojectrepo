package com.lnjefi.ecomproject.ecomprojectbackend.repository;


import com.lnjefi.ecomproject.ecomprojectbackend.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findByProductName(String productName);
}
