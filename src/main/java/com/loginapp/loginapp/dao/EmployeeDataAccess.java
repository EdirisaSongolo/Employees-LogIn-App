package com.loginapp.loginapp.dao;

import com.loginapp.loginapp.model.Employee;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.ArrayList;
import java.util.Optional;
import java.util.UUID;


@Repository("place holder")
public class EmployeeDataAccess //implements EmployeeDao
 {
  List<Employee> place_holder = new ArrayList<>();

  public int createEmployee (UUID employee_id, Employee new_employee)
   {
    place_holder.add(new Employee(employee_id, new_employee.getFirst_name(), new_employee.getLast_name()));
    return 1;
   }

  public Optional<Employee> retrieveDesignatedEmployee (UUID designated_employee_id)
   {
    Optional<Employee> designated_employee = place_holder.stream().filter(employee -> employee.getEmployee_id().equals(designated_employee_id)).findFirst();
    return designated_employee;
   }

  public int updateDesignatedEmployee (UUID employee_id, Employee employee)
   {

    return 1;
   }

  public List<Employee> fetchEmployees ()
   {
    return place_holder;
   }
 }
