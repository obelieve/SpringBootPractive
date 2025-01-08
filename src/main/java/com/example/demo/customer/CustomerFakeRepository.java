package com.example.demo.customer;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

/**
 * @Author zxy
 * @Date 2025/1/8
 */

public class CustomerFakeRepository implements CustomerRepo{
    @Override
    public List<Customer> getCustomers() {
        return Arrays.asList(
                new Customer(1L,"James Bond","password123"),
                new Customer(2L,"Jamila Ahmed","123password")
        );
    }
}
