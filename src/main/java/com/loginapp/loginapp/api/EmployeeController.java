package com.loginapp.loginapp.api;

import com.loginapp.loginapp.model.Employee;
import com.loginapp.loginapp.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RequestMapping("employees/signup")
@RestController
public class EmployeeController
 {
  private final EmployeeService employee_service;

  @Autowired
  public EmployeeController (EmployeeService employee_service)
   {
    this.employee_service = employee_service;
   }

   @PostMapping
   public void employee_signup (@RequestBody Employee employee)
    {
     employee_service.indexNewEmployee(employee);
    }

   @GetMapping(path = "{employee_id}")
   public Employee employee_details (@PathVariable("employee_id") UUID employee_id)
    {
     Employee designated_employee = employee_service.retrieveEmployee(employee_id).orElse(null);
     return designated_employee;
    }

   @GetMapping
   public List<Employee> employees_list ()
    {
     return employee_service.currentEmployees();
    }

 }
