package com.empapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.empapp.entities.Employee;
import com.empapp.service.EmployeeService;

@SpringBootApplication
public class Empapp2Application implements CommandLineRunner{
	@Autowired
	private EmployeeService empService;
	
	public static void main(String[] args) {
		SpringApplication.run(Empapp2Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		  //System.out.println("rec are saved...");
		/*
		 * empService.save(new Employee("Pooja",33)); empService.save(new
		 * Employee("Sravani", 30)); empService.save(new Employee("Padma", 10));
		 * empService.save(new Employee("krishna", 5));
		 */
		 
	}

}
