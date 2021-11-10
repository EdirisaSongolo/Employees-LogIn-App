package com.loginapp.loginapp.service;

import com.loginapp.loginapp.dao.SalariedDao;
import com.loginapp.loginapp.exceptions.UserErrors;
import com.loginapp.loginapp.model.Employee;
import com.loginapp.loginapp.model.SalariedEmployee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
 public class SalariedService
  {
   private final SalariedDao salaried_dao;

   @Autowired
   public SalariedService(@Qualifier("postgre") SalariedDao salaried_dao)
    {
     this.salaried_dao = salaried_dao;
    }

   public SalariedEmployee createSalariedEmployee (SalariedEmployee designated_employee)
    {
     UUID generated_id = UUID.randomUUID();
     String first_name = designated_employee.getEmployee_details().getFirst_name();
     String last_name = designated_employee.getEmployee_details().getLast_name();
     Employee employee_details = new Employee(generated_id, first_name, last_name);
     return new SalariedEmployee(generated_id, designated_employee.getEmployee_salary(), employee_details);
    }

   public void indexNewEmployee (SalariedEmployee designated_employee)
    {
     SalariedEmployee employee_profile = createSalariedEmployee(designated_employee);
     salaried_dao.save(employee_profile);
    }

   public List<SalariedEmployee> retrieveEmployeesList()
    {
     return salaried_dao.findAll();
    }
  }
