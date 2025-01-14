package com.example.demo.exception;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * @Author zxy
 * @Date 2025/1/14
 */
@ControllerAdvice
@Slf4j
public class ApiExceptionHandler {

    @ExceptionHandler(ApiRequestException.class)
    public ResponseEntity<Object> handleApiRequestException(ApiRequestException e){
        log.error("ApiRequestException error:"+e.getMessage());
        return new ResponseEntity<>(e, HttpStatus.NOT_FOUND);
    }
}
