package com.bitlabs.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bitlabs.Entity.Dependants;



public interface DependantsRepository extends JpaRepository <Dependants, Long> {

}
