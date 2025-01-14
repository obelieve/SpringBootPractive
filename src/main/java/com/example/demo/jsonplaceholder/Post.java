package com.example.demo.jsonplaceholder;

import lombok.Data;

/**
 * @Author zxy
 * @Date 2025/1/14
 */
@Data
public class Post {

    private Integer userId;
    private Integer id;
    private String title;
    private String body;
}
