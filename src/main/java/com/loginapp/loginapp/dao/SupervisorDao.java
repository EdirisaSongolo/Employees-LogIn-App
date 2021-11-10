package com.loginapp.loginapp.dao;

import com.loginapp.loginapp.model.Supervisor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface SupervisorDao extends JpaRepository<Supervisor, UUID>
 {

 }
