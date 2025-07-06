package com.cognizant.SpringDataJpa;

import com.cognizant.SpringDataJpa.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}