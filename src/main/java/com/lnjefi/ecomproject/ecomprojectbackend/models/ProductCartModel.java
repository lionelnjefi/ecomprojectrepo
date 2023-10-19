package com.lnjefi.ecomproject.ecomprojectbackend.models;

import com.lnjefi.ecomproject.ecomprojectbackend.dto.ProductDto;

import java.util.List;

public interface ProductCartModel {
    public List<ProductDto> getCartProductList();
}
