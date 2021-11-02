package com.loginapp.loginapp.exceptions;

public class UserErrors extends Exception
 {

     public UserErrors() {
         super();
     }

     public UserErrors (String message) {
         super(message);
     }

     public UserErrors (String message, Throwable cause) {
         super(message, cause);
     }

     public UserErrors (Throwable cause) {
         super(cause);
     }

     protected UserErrors (String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
         super(message, cause, enableSuppression, writableStackTrace);
     }
 }