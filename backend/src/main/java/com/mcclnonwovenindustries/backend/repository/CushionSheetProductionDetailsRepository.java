package com.mcclnonwovenindustries.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mcclnonwovenindustries.backend.entity.CushionSheetProductionDetails;

@Repository 
public interface CushionSheetProductionDetailsRepository extends JpaRepository<CushionSheetProductionDetails, Long> {
    
}
