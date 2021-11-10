package com.loginapp.loginapp.dao;

import com.loginapp.loginapp.model.SalariedEmployee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository("postgre")
public interface SalariedDao extends JpaRepository<SalariedEmployee, String>
 {

  @Query("SELECT emp FROM Employee emp WHERE emp.employee_id = ?1")
  public abstract Optional<SalariedEmployee> retrieveDesignatedEmployee (String designated_employee);


 }
