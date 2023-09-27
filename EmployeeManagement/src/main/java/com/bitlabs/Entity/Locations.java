package com.bitlabs.Entity;

import java.util.List;

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


@Table(name = "Location_Table")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Locations {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	Long location_id;
	String street_address;
	String postal_code;
	String city ;
	String state_province;
	
	@ManyToOne
    @JoinColumn(name = "country_id")
    private Countries country;

    @OneToMany(mappedBy = "location", cascade = CascadeType.ALL)
    private List<Departments> departments;

 
}
