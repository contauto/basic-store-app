package com.berkemaktav.basicstoreapp.validation;

import com.berkemaktav.basicstoreapp.model.Customer;
import com.berkemaktav.basicstoreapp.repository.CustomerRepository;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Objects;

@Component
public class UniqueUsernameValidator implements ConstraintValidator<UniqueUsername,String> {
    @Autowired
    CustomerRepository customerRepository;

    @Override
    public boolean isValid(String username, ConstraintValidatorContext constraintValidatorContext) {
        if(Objects.isNull(customerRepository)){
            return true;
        }
        Customer customer=customerRepository.findByUsername(username);
        return Objects.isNull(customer);
    }
}
