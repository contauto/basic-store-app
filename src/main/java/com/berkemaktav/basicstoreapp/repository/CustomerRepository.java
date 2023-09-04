package com.berkemaktav.basicstoreapp.repository;

import com.berkemaktav.basicstoreapp.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,String> {
    Customer findByUsername(String username);
}
