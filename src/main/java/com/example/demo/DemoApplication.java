package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 *
 * ./mvnm clean install      ⚠️：JAVA_HOME指定要和配置指定版本一样
 * java -jar demo-0.0.1-SNAPSHOT.jar --spring.profiles.active=staging --server.port=3000
 */
@SpringBootApplication
@EnableFeignClients
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}
