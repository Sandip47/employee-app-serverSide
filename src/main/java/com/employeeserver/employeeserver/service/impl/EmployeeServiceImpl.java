package com.employeeserver.employeeserver.service.impl;

import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employeeserver.employeeserver.entity.Employee;
import com.employeeserver.employeeserver.repo.EmployeeRepository;
import com.employeeserver.employeeserver.service.EmployeeService;

import jakarta.persistence.EntityNotFoundException;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;


	// Creating Employee

	@Override
	public Employee createEmployee(Employee employee) throws Exception {
		 return employeeRepository.save(employee);
		
	}


	// Getting user by userName
	@Override
	public Employee getEmployee(long id) {

		return this.employeeRepository.findById(id);

	}

	@Override
	public void deleteEmployee(Long id) {

		this.employeeRepository.deleteById(id);

	}

	@Override
	public Employee updateEmployee(Long userId, Employee updatedEmployee) throws Exception {
		Employee existingEmployee = employeeRepository.findById(userId)
				.orElseThrow(() -> new EntityNotFoundException("User not found"));

		if (updatedEmployee.getFirstName() != null) {
			existingEmployee.setFirstName(updatedEmployee.getFirstName());
		}

		if (updatedEmployee.getLastName() != null) {
			existingEmployee.setLastName(updatedEmployee.getLastName());
		}

		if (updatedEmployee.getEmail() != null) {
			existingEmployee.setEmail(updatedEmployee.getEmail());
		}
	
		if (updatedEmployee.getProfile() != null) {
			existingEmployee.setProfile(updatedEmployee.getProfile());
		}

		if (updatedEmployee.getPhone() != null) {
			existingEmployee.setPhone(updatedEmployee.getPhone());
		}

		// ... update other fields as needed

		return employeeRepository.save(existingEmployee);
	}

	
}
