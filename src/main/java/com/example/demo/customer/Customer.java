package com.example.demo.customer;

/**
 * @Author zxy
 * @Date 2025/1/8
 */
public class Customer {

    private final Long id;
    private final String name;

    public Customer(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public Long getCustomerId(){
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
