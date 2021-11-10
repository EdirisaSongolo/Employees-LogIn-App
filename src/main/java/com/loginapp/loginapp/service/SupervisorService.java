package com.loginapp.loginapp.service;

import com.loginapp.loginapp.exceptions.UserErrors;
import com.loginapp.loginapp.model.Employee;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class SupervisorService implements ServiceInterface
 {

     @Override
     public Employee createEmployee(UUID employee_id, String first_name, String last_name) {
         return null;
     }

     @Override
     public Optional<Employee> retrieveDesignatedEmployee(UUID employee_id) throws UserErrors {
         return Optional.empty();
     }

     @Override
     public List<Employee> retrieveEmployeesList() {
         return null;
     }
 }
