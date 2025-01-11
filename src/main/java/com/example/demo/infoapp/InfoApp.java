package com.example.demo.infoapp;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @Author zxy
 * @Date 2025/1/10
 */

@Configuration
@ConfigurationProperties(prefix = "info.app")
@Data
public class InfoApp {

    private String name;
    private String description;
    private String  version;
}
