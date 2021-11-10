package com.loginapp.loginapp.api;

import com.loginapp.loginapp.model.HourlyEmployee;
import com.loginapp.loginapp.service.HourlyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RequestMapping("hourlyEmployees")
@RestController
public class HourlyController
 {
  private final HourlyService hourly_service;

  @Autowired
  public HourlyController (HourlyService hourly_service)
   {
    this.hourly_service = hourly_service;
   }

  @PostMapping
  public void hourly_employee (@RequestBody HourlyEmployee designated_employee)
   {
    hourly_service.indexHourlyEmployee(designated_employee);
   }

  @GetMapping
  public List<HourlyEmployee> employees_list ()
   {
    List<HourlyEmployee> employees_list = hourly_service.hourly_employees();
    return employees_list;
   }
 }
