package com.example.demo.customer;

import com.example.demo.exception.ApiRequestException;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author zxy
 * @Date 2025/1/14
 */
@Service
@AllArgsConstructor
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public List<Customer> getCustomers(){
        return customerRepository.findAll();
    }

    public Customer getCustom(Integer id){
        return customerRepository.findById(id)
                .orElseThrow(()-> new ApiRequestException("customer not found with id "+id));
    }

    public Customer create(Customer customer){
        return customerRepository.save(customer);
    }
    public Customer update(Customer customer){
        return customerRepository.save(customer);
    }

    public void delete(Integer id){
        customerRepository.deleteById(id);
    }
}
