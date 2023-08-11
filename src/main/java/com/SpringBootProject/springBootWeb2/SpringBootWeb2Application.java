package com.SpringBootProject.springBootWeb2;

import com.SpringBootProject.springBootWeb2.model.Employee;
import com.SpringBootProject.springBootWeb2.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootWeb2Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootWeb2Application.class, args);
	}

	@Autowired
	private EmployeeRepository employeeRepository;
	@Override
	public void run(String... args) throws Exception {
		Employee employee = new Employee();
		employee.setFirstName("Ali6");
		employee.setLastName("Duq");
		employee.setEmailId("nopi@hotm.com");
		employeeRepository.save(employee);
	}
}
