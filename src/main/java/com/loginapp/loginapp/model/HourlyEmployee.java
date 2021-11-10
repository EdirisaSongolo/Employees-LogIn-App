package com.loginapp.loginapp.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;


import javax.persistence.*;
import java.util.UUID;

@Entity
@Data
@NoArgsConstructor
@Table(name = "hourlyemployee")
public class HourlyEmployee
 {
  @Id
  @Column(name = "hourly_emp")
  private String hourly_employee;
  @Column(name ="hourly_rate")
  private double hourly_wage;
  @OneToOne(cascade = CascadeType.ALL,
            fetch = FetchType.EAGER)
  @JoinColumn(
          name = "employee_id",
          referencedColumnName = "employee_id"
  )
  private Employee employee_details;

  public HourlyEmployee (UUID generated_id, @JsonProperty("hourly_wage") double hourly_wage, @JsonProperty Employee employee_details)
   {
    this.hourly_employee = "hly_"+generated_id.toString();
    this.hourly_wage = hourly_wage;
    this.employee_details = employee_details;
   }

  public double calculate_employee_earnings (int hours_worked)
   {
    return this.hourly_wage * hours_worked;
   }
 }
