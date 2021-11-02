package com.loginapp.loginapp.service;

import com.loginapp.loginapp.dao.EmployeeDao;
import com.loginapp.loginapp.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
 public class EmployeeService
  {
   private final EmployeeDao employeeDao;

   @Autowired
   public EmployeeService(@Qualifier("postgre") EmployeeDao employeeDao) {
    this.employeeDao = employeeDao;
   }

   public int indexNewEmployee (Employee employee)
    {
     return employeeDao.createEmployee(employee);
    }

   public Optional<Employee> retrieveEmployee (UUID designated_employee)
    {
     Optional<Employee> employee_details = employeeDao.retrieveDesignatedEmployee(designated_employee);
     return employee_details;
    }

   public List<Employee> currentEmployees ()
    {
     return employeeDao.fetchEmployees();
    }
  }
