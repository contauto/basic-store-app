package com.berkemaktav.basicstoreapp.service;

import com.berkemaktav.basicstoreapp.model.Product;
import com.berkemaktav.basicstoreapp.repository.ProductRepository;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
@Log4j2
public class ProductService {
    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Long createProduct(Product product){
        Product inDb=productRepository.findByName(product.getName());
        if (Objects.nonNull(inDb)){
            return inDb.getId();
        }
        return productRepository.save(product).getId();
    }
}
