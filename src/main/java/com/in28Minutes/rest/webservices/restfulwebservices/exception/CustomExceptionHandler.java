package com.in28Minutes.rest.webservices.restfulwebservices.exception;

import com.in28Minutes.rest.webservices.restfulwebservices.user.UserNotFoundException;

import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.time.LocalDateTime;


@ControllerAdvice
@RestController
public class CustomExceptionHandler extends ResponseEntityExceptionHandler {
    @ExceptionHandler(Exception.class)
    public final ResponseEntity<ExceptionResponse> handleAllException(Exception ex, WebRequest request)
    {
        ExceptionResponse excRes = new ExceptionResponse(LocalDateTime.now(), ex.getMessage(), request.getDescription(false));
        return new ResponseEntity<ExceptionResponse>(excRes, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler(UserNotFoundException.class)
    public final ResponseEntity<ExceptionResponse> handleUserNotFoundException(UserNotFoundException ex, WebRequest request)
    {
        ExceptionResponse excRes = new ExceptionResponse(LocalDateTime.now(), ex.getMessage(), request.getDescription(false));
        return new ResponseEntity<ExceptionResponse>(excRes, HttpStatus.NOT_FOUND);
    }

    @Override
    protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex, HttpHeaders headers, HttpStatusCode status, WebRequest request) {
        ExceptionResponse excRes = new ExceptionResponse(LocalDateTime.now(),
                "Total errors: " + ex.getErrorCount() + " || First Error: " + ex.getFieldError().getDefaultMessage(), request.getDescription(false));
        return new ResponseEntity(excRes, HttpStatus.BAD_REQUEST);
    }
}
