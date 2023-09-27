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


@Table(name = "Country_Table")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Countries {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    Long id;
	String country_name;
	   
	    @ManyToOne
	    @JoinColumn(name = "region_id")
	    private Regions region;
	
	@OneToMany(mappedBy = "country", cascade = CascadeType.ALL)
    private List<Locations> locations;
	
	
}
