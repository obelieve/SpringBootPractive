package com.example.demo.customer;

import com.example.demo.exception.NotFoundException;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * @Author zxy
 * @Date 2025/1/8
 *
 * shift +cmd + t 创建测试类
 */
@Service
@Slf4j
@AllArgsConstructor
public class CustomerService {

    private final CustomerRepository customerRepository;

    public List<Customer> getCustomers() {
        log.info("getCustomers was called");
        return customerRepository.findAll();
    }

    public Customer getCustomer(Long id){
        return customerRepository.findById(id)
                .orElseThrow(()->{
                        NotFoundException notFoundException = new NotFoundException("customer with id "+id+" not found");
                    log.error("error in getting customer {}",id,notFoundException);
                        return notFoundException;
                });
    }
}
