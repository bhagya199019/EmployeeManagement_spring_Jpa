package com.bitlabs.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bitlabs.Entity.Jobs;



public interface JobsRepository extends JpaRepository <Jobs, Long>{

}
