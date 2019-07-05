package com.service2.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionController {

  @ExceptionHandler(PersonNotFoundException.class)
  public String handledPersonNotFoundException(){
    return "Person not found";
  }

}
