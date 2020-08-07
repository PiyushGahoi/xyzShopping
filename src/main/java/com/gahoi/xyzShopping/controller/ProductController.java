package com.gahoi.xyzShopping.controller;

import javax.validation.constraints.NotNull;

import org.springframework.web.bind.annotation.*;

import com.gahoi.xyzShopping.model.Product;
import com.gahoi.xyzShopping.service.ProductService;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    private ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping(value = { "", "/" })
    public @NotNull Iterable<Product> getProducts() {
        return productService.getAllProducts();
    }
}
