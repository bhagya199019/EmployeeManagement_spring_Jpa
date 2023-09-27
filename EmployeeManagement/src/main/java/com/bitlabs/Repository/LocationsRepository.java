package com.bitlabs.Repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.bitlabs.Entity.Locations;

public interface LocationsRepository extends JpaRepository <Locations,Long> {

}
