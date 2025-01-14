package com.example.demo.customer;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Author zxy
 * @Date 2025/1/14
 */
@DataJpaTest
class CustomerServiceTest {


    CustomerRepository customerRepository;
    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
        customerRepository.deleteAll();
    }

    @Test
    void getCustomers() {
        customerRepository.save(new Customer(1,"name1","pwd1","email1"));
        customerRepository.save(new Customer(2,"name2","pwd2","email2"));
        assertEquals(2,customerRepository.findAll().size());
    }

    @Test
    void getCustom() {
        customerRepository.save(new Customer(1,"name1","pwd1","email1"));
        Customer customer = customerRepository.findById(1).orElseThrow();
        assertEquals(1,customer.getId());
        assertEquals("name1",customer.getName());
        assertEquals("pwd1",customer.getPassword());
        assertEquals("email1",customer.getEmail());
    }
}