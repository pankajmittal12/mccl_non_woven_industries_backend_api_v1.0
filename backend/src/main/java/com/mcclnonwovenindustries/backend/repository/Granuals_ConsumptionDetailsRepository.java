package com.mcclnonwovenindustries.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mcclnonwovenindustries.backend.entity.Granuals_ConsumpotionDetails;

@Repository 
public interface Granuals_ConsumptionDetailsRepository extends JpaRepository<Granuals_ConsumpotionDetails, Long> {
    
}
