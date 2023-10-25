package com.lnjefi.ecomproject.ecomprojectbackend.service;

import com.lnjefi.ecomproject.ecomprojectbackend.model.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
public class ProductServiceUnitTest {

    @Autowired
    private ProductService productService;

    @Test
    public void whenApplicationStarts_HibernateCreatesInitialRecords(){
        List<Product> productList = productService.listProducts();

        Assert.assertEquals(productList.size(), 2);
    }
}
