package com.example.demo.exception;

import lombok.Data;
import org.springframework.http.HttpStatus;

import java.time.ZonedDateTime;

/**
 * @Author zxy
 * @Date 2025/1/9
 */
@Data
public class ApiException {

    private final String message;
    private final Throwable throwable;
    private final HttpStatus httpStatus;
    private final ZonedDateTime zonedDateTime;
}
