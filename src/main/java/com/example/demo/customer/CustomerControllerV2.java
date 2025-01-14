package com.example.demo.customer;

import com.example.demo.exception.ApiRequestException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * @Author zxy
 * @Date 2025/1/14
 */
@RestController
@RequestMapping("/api/v2/customers")
@Slf4j
public class CustomerControllerV2 {

    @Autowired
    CustomerService customerService;

    @GetMapping
    public List<Customer> getCustomers(){
        return customerService.getCustomers();
    }

    @GetMapping("{customerId}")
    public Customer getCustomer(@PathVariable("customerId") Integer id){
        return customerService.getCustom(id);
    }

    @PostMapping
    public void createCustomer(@RequestBody @Valid Customer customer){
        log.info("createCustomer "+customer);
        customerService.create(customer);
    }

    @PutMapping
    public void putCustomer(@RequestBody @Valid Customer customer){
        log.info("putCustomer "+customer);
        customerService.update(customer);
    }

    @DeleteMapping("{customerId}")
    public void deleteCustomer(@PathVariable("customerId") Integer id){
        log.info("deleteCustomer "+id);
        customerService.delete(id);
    }
}
