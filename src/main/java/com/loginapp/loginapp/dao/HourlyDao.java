package com.loginapp.loginapp.dao;

import com.loginapp.loginapp.model.HourlyEmployee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HourlyDao extends JpaRepository<HourlyEmployee, String>
 {

 }
