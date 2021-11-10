package com.loginapp.loginapp.service;

import com.loginapp.loginapp.dao.EmployeeDao;
import com.loginapp.loginapp.exceptions.UserErrors;
import com.loginapp.loginapp.model.Employee;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.Optional;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeServiceTest
 {
  @Autowired
  private SalariedService employeeService;
  @MockBean
  private EmployeeDao employeeDao;
  private UUID temp_id = UUID.randomUUID();

//  @BeforeEach
//  void setUp()
//   {
//    Employee mock_employee_data = Employee.builder().employee_id(temp_id).first_name("Edirisa").last_name("Songolo").build();
//    Optional<Employee> mock_db_response = Optional.ofNullable(mock_employee_data);
//    Mockito.when(employeeDao.retrieveDesignatedEmployee(temp_id)).thenReturn(mock_db_response);
//   }
//
//   @Test
//   @DisplayName("Retrieve Employee based on provided employee id")
//   @Disabled
//  public void validEmployeeRetrieval () throws UserErrors
//   {
//    String test_name = "Edirisa";
//    Employee returned_employee = employeeService.retrieveDesignatedEmployee(temp_id).orElse(null);
//    assertEquals(test_name, returned_employee.getFirst_name());
//   }
 }