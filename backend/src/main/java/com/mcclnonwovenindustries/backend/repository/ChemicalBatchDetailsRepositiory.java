package com.mcclnonwovenindustries.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mcclnonwovenindustries.backend.entity.ChemicalBatchDetails;

@Repository 
public interface  ChemicalBatchDetailsRepositiory extends JpaRepository<ChemicalBatchDetails, Long> {
    
}
