package com.bitlabs.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

// import com.bitlabs.Entity.Departments;
import com.bitlabs.Entity.Employee;
import com.bitlabs.Repository.EmployeeRepository;


@RestController
public class EmployeeController {
	
	@Autowired
   	private EmployeeRepository employeeRepository;
   	
    @PostMapping("/addEmployee")
	public Employee saveEmployee(@RequestBody Employee employee) {
		System.out.println(employee);

    	return employeeRepository.save(employee);
		
	}
}
