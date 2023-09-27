package com.bitlabs.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Table(name = "Dependant_Table")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Dependants {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	Long dependent_id;
	String first_name; 
	String last_name;
	String relationship;

	
	@ManyToOne
    @JoinColumn(name = "employee_id")
    private Employee employee;

}
