package com.mcclnonwovenindustries.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mcclnonwovenindustries.backend.entity.GassYarnMachineProductionDetails;

@Repository 
public interface GrassYarnMachineProductionDetailsRepository extends JpaRepository<GassYarnMachineProductionDetails, Long> {
    
}
