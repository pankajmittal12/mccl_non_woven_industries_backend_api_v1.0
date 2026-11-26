package com.mcclnonwovenindustries.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mcclnonwovenindustries.backend.entity.CushionSheetProductionChemicalDetails;

@Repository 
public interface CushionSheetProductionChemicalDetailsRepository extends JpaRepository<CushionSheetProductionChemicalDetails, Long> {
    
}
