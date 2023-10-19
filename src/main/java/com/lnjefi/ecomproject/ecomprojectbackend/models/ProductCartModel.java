package com.lnjefi.ecomproject.ecomprojectbackend.models;

import com.lnjefi.ecomproject.ecomprojectbackend.dto.ProductCartDto;
import com.lnjefi.ecomproject.ecomprojectbackend.dto.ProductDto;

import java.math.BigDecimal;
import java.util.List;

public interface ProductCartModel {
    public List<ProductDto> getCartProductList();
    public BigDecimal getCartPriceSum(ProductCartDto cartDto);
}
