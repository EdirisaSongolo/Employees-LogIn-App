package com.loginapp.loginapp.model;

import com.fasterxml.jackson.annotation.JsonProperty;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table
public class Employee
 {
  @Id
  private UUID employee_id;
  private String first_name;
  private String last_name;
  private String email_address;
  private LocalDate date_of_birth;
  private Integer employee_age;

  public Employee() {
  }

  public Employee (@JsonProperty("employee_id") UUID employee_id, @JsonProperty("first_name") String first_name, @JsonProperty("last_name") String last_name)
   {
    this.employee_id = employee_id;
    this.first_name = first_name;
    this.last_name = last_name;
   }

  public Employee(String first_name, String last_name, String email_address, LocalDate date_of_birth, Integer employee_age) {
   this.first_name = first_name;
   this.last_name = last_name;
   this.email_address = email_address;
   this.date_of_birth = date_of_birth;
   this.employee_age = employee_age;
  }

  public Employee(UUID employee_id, String first_name, String last_name, String email_address, LocalDate date_of_birth, Integer employee_age) {
   this.employee_id = employee_id;
   this.first_name = first_name;
   this.last_name = last_name;
   this.email_address = email_address;
   this.date_of_birth = date_of_birth;
   this.employee_age = employee_age;
  }

  public UUID getEmployee_id() {
   return employee_id;
  }

  public void setEmployee_id(UUID employee_id) {
   this.employee_id = employee_id;
  }

  public String getFirst_name() {
   return first_name;
  }

  public void setFirst_name(String first_name) {
   this.first_name = first_name;
  }

  public String getLast_name() {
   return last_name;
  }

  public void setLast_name(String last_name) {
   this.last_name = last_name;
  }

  public String getEmail_address() {
   return email_address;
  }

  public void setEmail_address(String email_address) {
   this.email_address = email_address;
  }

  public LocalDate getDate_of_birth() {
   return date_of_birth;
  }

  public void setDate_of_birth(LocalDate date_of_birth) {
   this.date_of_birth = date_of_birth;
  }

  public Integer getEmployee_age() {
   return employee_age;
  }

  public void setEmployee_age(Integer employee_age) {
   this.employee_age = employee_age;
  }

  @Override
  public String toString() {
   return "Employee{" +
           "employee_id=" + employee_id +
           ", first_name='" + first_name + '\'' +
           ", last_name='" + last_name + '\'' +
           ", email_address='" + email_address + '\'' +
           ", date_of_birth=" + date_of_birth +
           ", employee_age=" + employee_age +
           '}';
  }
 }
