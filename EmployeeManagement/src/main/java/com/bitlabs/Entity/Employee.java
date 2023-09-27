package com.bitlabs.Entity;

// import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Date;

@Table(name = "Employee_Table")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Employee {
     
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	Long employee_id; 
	String first_name;
	String last_name;
	String email;
	Long phone_number;
	Date hire_date; 
	
	@Override
	public String toString() {
		return "Employee [employee_id=" + employee_id + ", first_name=" + first_name + ", last_name=" + last_name
				+ ", email=" + email + ", phone_number=" + phone_number + ", hire_date=" + hire_date + ", job=" + job
				+ ", salary=" + salary + ", manager_id=" + manager_id + ", department=" + department + ", dependants="
				+ dependants + "]";
	}


	@ManyToOne
    @JoinColumn(name = "job_id")
    private Jobs job;
	
	double salary;
	int manager_id;
	
	@ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JoinColumn(name = "department_id")
    private Departments department;
	
	
	@OneToMany(mappedBy = "employee", cascade = CascadeType.ALL)
	@JsonIgnoreProperties("employee")
    private List<Dependants> dependants;
}
