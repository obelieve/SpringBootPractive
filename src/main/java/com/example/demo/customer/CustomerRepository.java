package com.example.demo.customer;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @Author zxy
 * @Date 2025/1/8
 */
@Repository
public interface CustomerRepository extends JpaRepository<Customer,Long> {

}
