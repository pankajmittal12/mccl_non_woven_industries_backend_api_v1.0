package com.mcclnonwovenindustries.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mcclnonwovenindustries.backend.entity.CusionMatDetails;

@Repository 
public interface CusionMatDetailsRepository extends JpaRepository<CusionMatDetails, Long> {
    
}
