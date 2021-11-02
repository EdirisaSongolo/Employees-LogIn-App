package com.loginapp.loginapp.service;

import com.loginapp.loginapp.dao.EmployeeDao;
import com.loginapp.loginapp.exceptions.UserErrors;
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
   
   public Employee createEmployee (Employee new_employee)
    {
     UUID employee_id = UUID.randomUUID();
     return new Employee(employee_id, new_employee.getFirst_name(), new_employee.getLast_name());
    }

   public int indexNewEmployee (Employee designated_employee)
    {
     Employee employee = createEmployee(designated_employee);
     employeeDao.save(employee);
     return 1;
    }

   public Optional<Employee> retrieveEmployee (UUID designated_employee) throws UserErrors
    {
     Optional<Employee> employee_details = employeeDao.retrieveDesignatedEmployee(designated_employee);
     if (employee_details.isPresent() == false)
      {
       throw new UserErrors("Employee was not found amongst our records");
      }
     return employee_details;
    }

   public List<Employee> currentEmployees ()
    {
     return employeeDao.findAll();
    }
  }
