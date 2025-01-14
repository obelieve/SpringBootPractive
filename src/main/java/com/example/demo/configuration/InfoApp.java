package com.example.demo.configuration;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @Author zxy
 * @Date 2025/1/14
 */
@Configuration
@Data
@ConfigurationProperties(prefix = "info.app")
public class InfoApp {
    private String name;
    private String description;
    private String version;
}
