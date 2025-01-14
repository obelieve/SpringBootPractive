package com.example.demo.jsonplaceholder;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author zxy
 * @Date 2025/1/14
 */
@Configuration
public class JSONPlaceHolderConfiguration {

    @Bean("jsonplaceholder")
    public CommandLineRunner commandLineRunner(JSONPlaceHolderClient jsonPlaceHolderClient){
        return args -> {
            System.out.println("/posts");
            System.out.println(jsonPlaceHolderClient.getPosts().size());
            System.out.println("post/1");
            System.out.println(jsonPlaceHolderClient.getPost(1));
        };
    }
}
