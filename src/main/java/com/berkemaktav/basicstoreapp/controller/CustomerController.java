package com.berkemaktav.basicstoreapp.controller;

import com.berkemaktav.basicstoreapp.model.Customer;
import com.berkemaktav.basicstoreapp.service.CustomerService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/1.0/customer")
public class CustomerController {
    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @PostMapping
    public void createCustomer(@Valid @RequestBody Customer customer){
        customerService.createCustomer(customer);
    }
}
