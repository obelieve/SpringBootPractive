package com.example.demo.jsonplaceholder;

import lombok.Data;

/**
 * @Author zxy
 * @Date 2025/1/10
 */
@Data
public class Post {

    private final Integer userId;
    private final Integer id;

    private final String title;

    private final String body;
}
