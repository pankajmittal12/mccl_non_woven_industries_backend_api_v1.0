package com.mcclnonwovenindustries.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mcclnonwovenindustries.backend.entity.TotalMatScrapDetails;

@Repository 
public interface TotalMatScrapDetailsRepository extends JpaRepository<TotalMatScrapDetails, Long> {
    
}
