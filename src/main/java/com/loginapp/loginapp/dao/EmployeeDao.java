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
  public abstract int createEmployee (UUID employee_id, Employee new_employee);
  public default int createEmployee (Employee new_employee)
   {
    UUID employee_id = UUID.randomUUID();
    return createEmployee(employee_id, new_employee);
   }

  public abstract Optional<Employee> retrieveDesignatedEmployee (UUID designated_employee_id);
  public abstract int updateDesignatedEmployee (UUID employee_id, Employee employee);

  @Query("SELECT * FROM employee")
  public abstract List<Employee> fetchEmployees ();
 }
