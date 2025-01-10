package com.example.demo.jsonplaceholder;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author zxy
 * @Date 2025/1/10
 */
@Configuration
public class JSONPlaceHolderConfiguration {

    @Bean("jsonplaceholder")
    CommandLineRunner runner(JSONPlaceHolderClient
                                     jsonPlaceHolderClient){
        return args -> {
            ///sout
//            System.out.println("https://jsonplaceholder.typicode.com/posts");
//            System.out.println(jsonPlaceHolderClient.getPosts().size());
//            System.out.println();
//            System.out.println("https://jsonplaceholder.typicode.com/posts/1");
//            System.out.println(jsonPlaceHolderClient.getPost(1));
        };
    }
}
