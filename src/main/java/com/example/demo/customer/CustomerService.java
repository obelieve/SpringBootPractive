package com.example.demo.customer;

import org.springframework.stereotype.Component;

/**
 * @Author zxy
 * @Date 2025/1/8
 */
@Component
public class CustomerService {


    public Customer getCustomer() {
        return new Customer(1L,"zxy");
    }
}
