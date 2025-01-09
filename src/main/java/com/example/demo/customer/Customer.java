package com.example.demo.customer;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotBlank;

/**
 * @Author zxy
 * @Date 2025/1/8
 */
public class Customer {

    private final Long id;

    @NotBlank
    private final String name;
    @NotBlank
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private final String password;

    public Customer(Long id, String name, String password) {
        this.id = id;
        this.name = name;
        this.password = password;
    }

    @JsonProperty("customer_id")
    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @JsonIgnore
    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
