package com.berkemaktav.basicstoreapp.controller;

import com.berkemaktav.basicstoreapp.model.Product;
import com.berkemaktav.basicstoreapp.service.ProductService;
import io.github.resilience4j.ratelimiter.annotation.RateLimiter;
import jakarta.validation.Valid;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Log4j2
@RestController
@RequestMapping("/product")
public class ProductController {
    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping
    @RateLimiter(name = "createLimit")
    public ResponseEntity<Long> createProduct(@RequestBody @Valid Product product) {
        return ResponseEntity.ok(productService.createProduct(product));
    }
}
