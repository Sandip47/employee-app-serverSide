package com.employeeserver.employeeserver.service;

import java.util.Optional;
import java.util.Set;

import com.employeeserver.employeeserver.entity.Employee;

public interface EmployeeService {

	public Employee createEmployee(Employee employee) throws Exception;

	void deleteEmployee(Long id);

	Employee updateEmployee(Long userId, Employee updatedUser) throws Exception;

	public Employee getEmployee(long id);
}
