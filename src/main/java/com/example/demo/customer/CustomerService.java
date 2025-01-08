package com.example.demo.customer;

import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @Author zxy
 * @Date 2025/1/8
 */
@Component
public class CustomerService {

    private final CustomerRepo customerRepo;

    public CustomerService(CustomerRepo customerRepo) {
        this.customerRepo = customerRepo;
    }


    public List<Customer> getCustomers() {
        return customerRepo.getCustomers();
    }
}
