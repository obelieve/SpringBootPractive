package com.example.demo.customer;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @Author zxy
 * @Date 2025/1/8
 */
@Component
public class CustomerRepository implements CustomerRepo{
    @Override
    public List<Customer> getCustomers() {
        // TODO connect to real db
        return Collections.emptyList();
    }
}
