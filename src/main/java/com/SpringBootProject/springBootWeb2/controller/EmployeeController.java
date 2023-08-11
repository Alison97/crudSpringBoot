package com.SpringBootProject.springBootWeb2.controller;


import com.SpringBootProject.springBootWeb2.exception.ResourceNotFoundException;
import com.SpringBootProject.springBootWeb2.model.Employee;
import com.SpringBootProject.springBootWeb2.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/employees")
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;

    @GetMapping ({"/list"})
    public List<Employee> getAllEmployees (){
        return employeeRepository.findAll();
    }

    //build create employee REST API
    @PostMapping
    public Employee createEmployee (@RequestBody Employee employee){
        return employeeRepository.save(employee);
    }

    // build get employee by id REST API
    @GetMapping("{id}")
    public ResponseEntity<Employee> getEmployeeById (@PathVariable long id){
        Employee employee = employeeRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Employee not exist with id:" + id));
        return ResponseEntity.ok(employee);
    }
}
