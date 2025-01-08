package com.example.demo.customer;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @Author zxy
 * @Date 2025/1/8
 */
@Component
public class CustomerService {

    private final CustomerRepo customerRepo;

    public CustomerService(
//            @Qualifier("fake")
            CustomerRepo customerRepo) {
        this.customerRepo = customerRepo;
    }


    public List<Customer> getCustomers() {
        return customerRepo.getCustomers();
    }
}
