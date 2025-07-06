package com.cognizant.SpringDataJpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringDataJpaApplication {

	@Autowired
	private static EmployeeService employeeService;

	public static void main(String[] args) {
		SpringApplication.run(SpringDataJpaApplication.class, args);
		test();
	}

	public static void test() {
		Employee emp = new Employee();
		emp.setName("Aditya Shrivastava");
		emp.setDepartment("IT");
		emp.setSalary(50000);

		employeeService.addEmployee(emp);
		employeeService.printAll();
	}

}
