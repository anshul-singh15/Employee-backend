package com.EmployeeBackend.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.stereotype.Repository;

import com.EmployeeBackend.springboot.model.Employee;


public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}