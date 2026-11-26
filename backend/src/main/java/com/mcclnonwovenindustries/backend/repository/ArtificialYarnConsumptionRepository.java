package com.mcclnonwovenindustries.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mcclnonwovenindustries.backend.entity.ArtificialYarnConsumption;

@Repository 
public interface ArtificialYarnConsumptionRepository extends JpaRepository<ArtificialYarnConsumption, Long> {
    
}
