package com.loginapp.loginapp.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Data
@NoArgsConstructor
@Table(name = "salaryemployee")
public class SalariedEmployee
 {
  @Id
  @Column(name = "salary_emp")
  private String salaried_employee;
  @Column(name = "Salary")
  private double employee_salary;
  @OneToOne(cascade = CascadeType.ALL,
            fetch = FetchType.EAGER)
  @JoinColumn(
          name = "employee_id",
          referencedColumnName = "employee_id"
  )
  private Employee employee_details;

  public SalariedEmployee (UUID salaried_employee, @JsonProperty("employee_salary") double employee_salary, Employee employee_details)
   {
    this.salaried_employee = "sly_"+salaried_employee.toString();;
    this.employee_salary = employee_salary;
    this.employee_details = employee_details;
   }

  public double employeeEarnings ()
   {
    return this.employee_salary;
   }
 }
