package com.loginapp.loginapp.exceptions;

import com.loginapp.loginapp.SystemResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
@ResponseStatus
public class ControllerResponse extends ResponseEntityExceptionHandler
 {

  @ExceptionHandler(UserErrors.class)
  public ResponseEntity<SystemResponse> relaySystemResponse (UserErrors registeredError, WebRequest userRequest)
   {
    SystemResponse generatedResponse = new SystemResponse(HttpStatus.NOT_FOUND, registeredError.getMessage());
    return ResponseEntity.status(HttpStatus.NOT_FOUND).body(generatedResponse);
   }
 }
