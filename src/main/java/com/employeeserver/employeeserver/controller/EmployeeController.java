package com.employeeserver.employeeserver.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.employeeserver.employeeserver.entity.Employee;
import com.employeeserver.employeeserver.repo.EmployeeRepository;
import com.employeeserver.employeeserver.service.EmployeeService;

@RestController
@RequestMapping("/employee")
@CrossOrigin("*")
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;
	
	@Autowired
    private EmployeeRepository employeeRepository;

	@PostMapping("/")
	public Employee createEmployee(@RequestBody Employee employee) throws Exception {	
		return this.employeeService.createEmployee(employee);
	}

	 @GetMapping("/")
	 public List<Employee> getAllEmployees() {
	        return this.employeeRepository.findAll();
	    }
	
	
	@GetMapping("/{id}")
	public Employee getEmployee(@PathVariable("id") long id) throws Exception {
		return this.employeeService.getEmployee(id);
	}

	@DeleteMapping("/delete/{id}")
	public void deleteUser(@PathVariable("id") Long id) {
		this.employeeService.deleteEmployee(id);

	}

	@PutMapping("/update/{id}")
	public ResponseEntity<Employee> updateUser(@PathVariable("id") Long id, @RequestBody Employee updatedEmployee)
			throws Exception {
		Employee emp = this.employeeService.updateEmployee(id, updatedEmployee);
		return ResponseEntity.ok(emp);
	}
}
