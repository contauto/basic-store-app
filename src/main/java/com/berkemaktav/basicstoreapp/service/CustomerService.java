package com.berkemaktav.basicstoreapp.service;

import com.berkemaktav.basicstoreapp.model.Customer;
import com.berkemaktav.basicstoreapp.repository.CustomerRepository;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
    private final CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public void createCustomer(Customer customer){
    customerRepository.save(customer);
    }
}
