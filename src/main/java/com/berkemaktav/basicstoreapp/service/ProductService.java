package com.berkemaktav.basicstoreapp.service;

import com.berkemaktav.basicstoreapp.exception.BlankFieldException;
import com.berkemaktav.basicstoreapp.model.Product;
import com.berkemaktav.basicstoreapp.repository.ProductRepository;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    private final ProductRepository productRepository;
    private static final Logger logger= LogManager.getLogger(ProductService.class);

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Long createProduct(Product product) {
        if (product.getName().isBlank()) {
            logger.error("Product name is blank");
            throw new BlankFieldException("Field is blank");
        }

        Product inDb = productRepository.findByName(product.getName());
        return inDb != null ? inDb.getId() : productRepository.save(product).getId();
    }

}
