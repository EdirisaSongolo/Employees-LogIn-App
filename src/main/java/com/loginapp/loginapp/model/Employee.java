package com.loginapp.loginapp.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.time.LocalDate;
import java.util.UUID;

@Entity
@Data
@NoArgsConstructor

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

  public Employee (@JsonProperty("employee_id") UUID employee_id, @JsonProperty("first_name") String first_name, @JsonProperty("last_name") String last_name)
   {
    this.employee_id = employee_id;
    this.first_name = first_name;
    this.last_name = last_name;
   }

  public Employee (UUID employee_id, String first_name, String last_name, String email_address, LocalDate date_of_birth, Integer employee_age) {
   this.employee_id = employee_id;
   this.first_name = first_name;
   this.last_name = last_name;
   this.email_address = email_address;
   this.date_of_birth = date_of_birth;
   this.employee_age = employee_age;
  }

 }
