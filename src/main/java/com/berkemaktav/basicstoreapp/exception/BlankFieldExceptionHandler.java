package com.berkemaktav.basicstoreapp.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class BlankFieldExceptionHandler {
    @ExceptionHandler(BlankFieldException.class)
    public ResponseEntity<Object> handleCustomException(BlankFieldException ex) {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(ex.getMessage());
    }
}
