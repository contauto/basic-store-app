package com.berkemaktav.basicstoreapp.repository;

import com.berkemaktav.basicstoreapp.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {
    Product findByName(String name);
}
