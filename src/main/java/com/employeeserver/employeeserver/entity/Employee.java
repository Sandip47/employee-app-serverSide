package com.employeeserver.employeeserver.entity;

import java.util.*;

import org.springframework.context.annotation.Bean;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.*;


@Table(name = "employee")
@Entity
public class Employee {	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	private String firstName;
	private String lastName;
	private String email;
	private String phone;
	private String profile;
	private boolean enable = true;

	public Employee() {
		super();
	}

	public Employee(long id, String firstName, String lastName, String email,
			String phone, String profile, boolean enable) {
		super();
		this.id = id;
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phone = phone;
		this.profile = profile;
		this.enable = enable;
	}

	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getProfile() {
		return profile;
	}

	public void setProfile(String profile) {
		this.profile = profile;
	}

	public boolean isEnable() {
		return enable;
	}

	public void setEnable(boolean enable) {
		this.enable = enable;
	}

	

}