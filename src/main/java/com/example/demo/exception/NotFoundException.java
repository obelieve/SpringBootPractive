package com.example.demo.exception;

/**
 * @Author zxy
 * @Date 2025/1/14
 */
public class NotFoundException extends RuntimeException {
    public NotFoundException(String message) {
        super(message);
    }

    public NotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
