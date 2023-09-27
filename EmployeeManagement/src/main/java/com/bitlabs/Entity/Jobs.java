package com.bitlabs.Entity;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name = "Jobs_Table")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Jobs {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	Long job_id;
	String job_title;
	Double min_salary;
	Double max_salary;
	
	@OneToMany(mappedBy = "job", cascade = CascadeType.ALL)
//	@JsonIgnoreProperties("job")
    private List<Employee> employees;
}
