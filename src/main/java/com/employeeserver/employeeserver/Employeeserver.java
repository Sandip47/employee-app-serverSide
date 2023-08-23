package com.employeeserver.employeeserver;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Employeeserver implements CommandLineRunner  {

	public static void main(String[] args) {
		SpringApplication.run(Employeeserver.class, args);
	}
	@Override
	public void run(String... args) throws Exception  {
		// TODO Auto-generated method stub
			
		System.out.println("Starting Code");

		
	}
	

}
