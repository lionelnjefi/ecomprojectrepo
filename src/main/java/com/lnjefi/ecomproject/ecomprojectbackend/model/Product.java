package com.lnjefi.ecomproject.ecomprojectbackend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Entity
@Data
@NoArgsConstructor
public class Product {
    @Id
    @GeneratedValue
    private Long id;
    @NotNull
    private String productName;
    @NotNull
    private String productDescription;
    @NotNull
    private BigDecimal productPrice;
    @NotNull
    private int productQuantity;
}
