package com.java.gowtham.DemoProject.exceptionAdvicer;

import com.java.gowtham.DemoProject.exception.UserNotFoundException;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestControllerAdvice
public class ApplicationExceptionHandler extends ResponseEntityExceptionHandler {
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ExceptionHandler(UserNotFoundException.class)
    public Map<String, String> getElementByIdServiceNotFoundException(UserNotFoundException ex) {
        Map<String, String> errorHandler = new HashMap<>();
        errorHandler.put("INTERNAL-MESSAGE-ERROR ", ex.getMessage());
        return errorHandler;
    }

    protected ResponseEntity<Object> handleMethodArgumentNotValidException(MethodArgumentNotValidException ex,
                                                                           HttpHeaders headers,
                                                                           HttpStatusCode statusCode,
                                                                           WebRequest webRequest){
        String str = ex.getBindingResult().getAllErrors().get(0).getDefaultMessage();
        return new ResponseEntity<>(str, HttpStatus.BAD_REQUEST);
    }
}
