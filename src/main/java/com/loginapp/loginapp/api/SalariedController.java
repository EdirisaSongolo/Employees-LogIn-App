package com.loginapp.loginapp.api;

import com.loginapp.loginapp.model.SalariedEmployee;
import com.loginapp.loginapp.service.SalariedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("salaryemployee")
public class SalariedController
 {
  private final SalariedService salaried_service;

  @Autowired
  public SalariedController (SalariedService salaried_service)
   {
    this.salaried_service = salaried_service;
   }

   @PostMapping
   public void salary_employee (@RequestBody SalariedEmployee designated_employee)
    {
     salaried_service.indexNewEmployee(designated_employee);
    }

   @GetMapping
   public List<SalariedEmployee> employeeList ()
    {
     return salaried_service.retrieveEmployeesList();
    }
 }
