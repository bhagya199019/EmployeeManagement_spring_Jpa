package com.bitlabs.Entity;

import java.util.List;

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


@Table(name = "Region_Table")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Regions {

	 @Id
	 @GeneratedValue(strategy=GenerationType.IDENTITY)
     Long region_id;
     String region_name;
    
     @OneToMany(mappedBy = "region", cascade = CascadeType.ALL)
     private List<Countries> countries;

}
