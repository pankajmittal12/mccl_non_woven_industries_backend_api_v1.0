package com.mcclnonwovenindustries.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mcclnonwovenindustries.backend.entity.OddRollLengthDetails;

@Repository 
public interface OddRollLengthDetailsRepository extends JpaRepository<OddRollLengthDetails, Long> {
    
}
