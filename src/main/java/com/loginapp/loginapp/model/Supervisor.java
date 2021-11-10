package com.loginapp.loginapp.model;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import java.util.UUID;

@Entity
@Data
@NoArgsConstructor
public class Supervisor
 {
  @Id
  private UUID supervisor_id;
  private double employee_salary;
  private double managerial_comp;

//  @OneToOne
//  @JoinColumn(
//          name = "employee_id",
//          referencedColumnName = "employee_id"
//  )
//  private Employee employee_entity;

  public double calculateEmployeeEarnings ()
   {
    return this.employee_salary + this.managerial_comp;
   }


 }
