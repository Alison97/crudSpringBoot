package com.SpringBootProject.springBootWeb2.repository;

import com.SpringBootProject.springBootWeb2.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

//no es necesario agregar la anotacion repository ya que al ser jpa se realiza internamente
public interface EmployeeRepository extends JpaRepository <Employee, Long> {

    // all crud database method

}
