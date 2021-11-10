package com.loginapp.loginapp.service;


import com.loginapp.loginapp.dao.EmployeeDao;
import com.loginapp.loginapp.exceptions.UserErrors;
import com.loginapp.loginapp.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class EmployeeService implements ServiceInterface
 {
  private final EmployeeDao employee_dao;

  @Autowired
  public EmployeeService (EmployeeDao employee_dao)
   {
    this.employee_dao = employee_dao;
   }

  @Override
  public Employee createEmployee(UUID employee_id, String first_name, String last_name)
   {
    return new Employee(employee_id, first_name, last_name);
   }

  public void indexNewEmployee (Employee designated_employee)
   {
    Employee employee_details = createEmployee(designated_employee);
    employee_dao.save(employee_details);
   }

  @Override
  public Optional<Employee> retrieveDesignatedEmployee(UUID employee_id) throws UserErrors
   {
    return Optional.empty();
   }

  @Override
  public List<Employee> retrieveEmployeesList()
   {
    return employee_dao.findAll();
   }
 }
