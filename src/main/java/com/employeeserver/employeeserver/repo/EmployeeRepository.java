package com.employeeserver.employeeserver.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.employeeserver.employeeserver.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

	public Employee findById(long id);

}
