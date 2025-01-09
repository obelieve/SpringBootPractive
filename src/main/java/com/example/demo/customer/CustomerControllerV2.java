package com.example.demo.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

/**
 * @Author zxy
 * @Date 2025/1/8
 */

/**
 * <24>
 * api版本控制命名
 * api/v1/customer
 * api/v2/customer
 */
@RequestMapping(path = "api/v2/customer")
@RestController
public class CustomerControllerV2 {

    private final CustomerService customerService;

    @Autowired
    public CustomerControllerV2(CustomerService customerService){
        this.customerService = customerService;
    }

    @GetMapping(path = "all")
    List<Customer> getCustomers() {
        return Arrays.asList(
                new Customer(0L,"V2","V2")
        );
    }

    @PostMapping
    void createNewCustomer(@RequestBody Customer customer){
        System.out.println("POST REQUEST..");
        System.out.println(customer);
    }

    @PutMapping
    void updateCustomer(@RequestBody Customer customer){
        System.out.println("UPDATE REQUEST..");
        System.out.println(customer);
    }

    @DeleteMapping(path = "{customerId}")
    void deleteCustomer(@PathVariable("customerId") Long id){
        System.out.println("DELETE REQUEST FOR CUSTOMER WITH ID "+id);
    }
}
