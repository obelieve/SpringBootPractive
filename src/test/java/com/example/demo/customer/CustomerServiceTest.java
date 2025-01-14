package com.example.demo.customer;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Author zxy
 * @Date 2025/1/14
 */
@DataJpaTest
class CustomerServiceTest {


    @Autowired
    private CustomerRepository customerRepository;

    private CustomerService underTest;
    @BeforeEach
    void setUp() {
        underTest = new CustomerService(customerRepository);
    }

    @AfterEach
    void tearDown() {
        customerRepository.deleteAll();
    }

    @Test
    void getCustomers() {
//        customerRepository.saveAll(Arrays.asList(
//                new Customer(1,"name1","pwd1","email1@gmail.com"),
//                new Customer(2,"name2","pwd2","email2@gmail.com")
//        ));
        customerRepository.save(new Customer(1,"name1","pwd1","email1@gmail.com"));
        customerRepository.save(new Customer(2,"name2","pwd2","email2@gmail.com"));
        assertEquals(2,customerRepository.findAll().size());
    }

    @Test
    void getCustom() {
        customerRepository.save(new Customer(1,"name1","pwd1","email1@gmail.com"));
        Customer customer = customerRepository.findById(1).orElseThrow();//underTest.getCustom(1);
        assertEquals(1,customer.getId());
        assertEquals("name1",customer.getName());
        assertEquals("pwd1",customer.getPassword());
        assertEquals("email1@gmail.com",customer.getEmail());
    }
}