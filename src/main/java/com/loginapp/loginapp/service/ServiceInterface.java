package com.loginapp.loginapp.service;

import com.loginapp.loginapp.exceptions.UserErrors;
import com.loginapp.loginapp.model.Employee;
import com.loginapp.loginapp.model.HourlyEmployee;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface ServiceInterface
 {
  public abstract Employee createEmployee (UUID employee_id, String first_name, String last_name);

  public default Employee createEmployee (Employee new_employee)
   {
    UUID generated_id = UUID.randomUUID();
    return createEmployee (generated_id, new_employee.getFirst_name(), new_employee.getLast_name());
   }

  public Optional<Employee> retrieveDesignatedEmployee (UUID employee_id) throws UserErrors;

  public List<Employee> retrieveEmployeesList ();
 }
