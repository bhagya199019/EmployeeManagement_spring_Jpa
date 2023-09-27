package com.bitlabs.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bitlabs.Entity.Departments;


public interface DepartmentsRepository extends JpaRepository <Departments,Integer>{

}
