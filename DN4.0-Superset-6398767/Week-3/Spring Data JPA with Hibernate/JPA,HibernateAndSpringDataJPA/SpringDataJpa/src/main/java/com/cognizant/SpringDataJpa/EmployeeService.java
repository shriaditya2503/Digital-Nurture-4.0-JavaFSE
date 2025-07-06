package com.cognizant.SpringDataJpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository repository;

    public void addEmployee(Employee employee) {
        repository.save(employee);
    }

    public void printAll() {
        repository.findAll().forEach(System.out::println);
    }
}
