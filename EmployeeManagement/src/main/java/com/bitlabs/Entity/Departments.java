package com.bitlabs.Entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
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


@Table(name = "Department_Table")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Departments {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int department_id;
	String department_name; 

	
	@ManyToOne
    @JoinColumn(name = "location_id")
    private Locations location;

 
   @OneToMany(mappedBy = "department", cascade = CascadeType.ALL)
 //  @JsonIgnoreProperties("department")
    private List<Employee> employees;

 
	

}
