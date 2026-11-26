package com.mcclnonwovenindustries.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mcclnonwovenindustries.backend.entity.InkConsumption;

@Repository 
public interface InkConsumptionRepository extends JpaRepository<InkConsumption, Long> {
    
}
