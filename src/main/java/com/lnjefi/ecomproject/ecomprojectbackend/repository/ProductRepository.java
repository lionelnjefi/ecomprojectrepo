package com.lnjefi.ecomproject.ecomprojectbackend.repository;


import com.lnjefi.ecomproject.ecomprojectbackend.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProductRepository extends JpaRepository<Product, Long> {
}
