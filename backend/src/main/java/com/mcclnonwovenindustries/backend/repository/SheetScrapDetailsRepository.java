package com.mcclnonwovenindustries.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mcclnonwovenindustries.backend.entity.SheetScrapDetails;

@Repository 
public interface SheetScrapDetailsRepository extends JpaRepository<SheetScrapDetails, Long> {
    
}
