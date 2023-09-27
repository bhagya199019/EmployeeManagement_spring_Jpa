package com.bitlabs.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bitlabs.Entity.Employee;



public interface EmployeeRepository extends JpaRepository <Employee, Long>{

}
