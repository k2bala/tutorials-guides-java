package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.demo.dao.EmployeeRepository;
import com.example.demo.entity.Employee;

@Component 
public class DatabaseLoader implements CommandLineRunner { 

	private final EmployeeRepository repository;

	@Autowired 
	public DatabaseLoader(EmployeeRepository repository) {
		this.repository = repository;
	}

	@Override
	public void run(String... strings) throws Exception {
		this.repository.save(new Employee("Frodo", "Baggins", "ring bearer"));
	}
}
