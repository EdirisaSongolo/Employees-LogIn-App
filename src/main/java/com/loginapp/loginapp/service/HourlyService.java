package com.loginapp.loginapp.service;

import com.loginapp.loginapp.dao.HourlyDao;

import com.loginapp.loginapp.model.Employee;
import com.loginapp.loginapp.model.HourlyEmployee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class HourlyService
 {
  private final HourlyDao hourly_dao;

  @Autowired
  public HourlyService (HourlyDao hourly_dao)
   {
    this.hourly_dao = hourly_dao;
   }

  public HourlyEmployee createHourlyEmployee (HourlyEmployee designated_employee)
   {
    UUID generated_id = UUID.randomUUID();
    String first_name = designated_employee.getEmployee_details().getFirst_name();
    String last_name = designated_employee.getEmployee_details().getLast_name();
    Employee employee_details = new Employee(generated_id, first_name, last_name);
    return new HourlyEmployee(generated_id, designated_employee.getHourly_wage(), employee_details);
   }

  public void indexHourlyEmployee (HourlyEmployee designated_employee)
   {
    HourlyEmployee employee_profile = createHourlyEmployee(designated_employee);
    hourly_dao.save(employee_profile);
   }

  public List<HourlyEmployee> hourly_employees ()
   {
    List<HourlyEmployee> employees_list = hourly_dao.findAll();
    return employees_list;
   }

 }
