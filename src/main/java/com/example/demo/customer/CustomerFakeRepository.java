package com.example.demo.customer;

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
                new Customer(1L,"James Bond","password123", "email@gmail.com"),
                new Customer(2L,"Jamila Ahmed","123password", "email@gmail.com")
        );
    }
}
