package com.loginapp.loginapp.dao;

import com.loginapp.loginapp.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;
import java.util.List;

@Repository("postgre")
public interface EmployeeDao extends JpaRepository<Employee, UUID>
 {
  @Query("FROM Employee WHERE employee_id = ?1")
  public abstract Optional<Employee> retrieveDesignatedEmployee (UUID designated_employee);
 }
