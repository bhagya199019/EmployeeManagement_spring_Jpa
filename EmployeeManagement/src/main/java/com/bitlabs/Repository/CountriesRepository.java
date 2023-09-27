package com.bitlabs.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bitlabs.Entity.Countries;


public interface CountriesRepository extends JpaRepository <Countries, Long> {

}
