package com.example.demo.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

/**
 * @Author zxy
 * @Date 2025/1/14
 */
@Configuration
public class DemoConfiguration {

    @Value("${info.app.name}")
    private String infoAppName;

    @Autowired
    private Environment environment;

    @Autowired
    private InfoApp infoApp;

    @Bean
    CommandLineRunner commandLineRunner(){
        return args -> {
            System.out.println("DemoConfiguration -> commandLineRunner");
            System.out.println(environment.getProperty("info.app.version"));
            System.out.println(infoAppName);
            System.out.println(infoApp);
        };
    }
}
