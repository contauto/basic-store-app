package com.berkemaktav.basicstoreapp.service;

import com.berkemaktav.basicstoreapp.model.Customer;
import com.berkemaktav.basicstoreapp.repository.CustomerRepository;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
    private final CustomerRepository customerRepository;
    private static final Logger logger= LogManager.getLogger(ProductService.class);

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public void createCustomer(Customer customer){
        logger.info("Customer will save with this username: {}",customer.getUsername());
        customerRepository.save(customer);
    }
}
