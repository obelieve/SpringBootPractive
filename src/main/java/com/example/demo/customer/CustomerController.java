package com.example.demo.customer;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author zxy
 * @Date 2025/1/8
 */
@RestController
public class CustomerController {

    @GetMapping
    Customer getCustomer() {
        return new Customer(1L,"zxy");
    }
}
