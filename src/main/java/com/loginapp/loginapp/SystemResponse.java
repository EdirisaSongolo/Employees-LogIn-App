package com.loginapp.loginapp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

@Data
@NoArgsConstructor
public class SystemResponse
 {
  private HttpStatus request_status;
  private String user_error;

  public SystemResponse (HttpStatus request_status, String user_error)
   {
    this.request_status = request_status;
    this.user_error = user_error;
   }
 }
