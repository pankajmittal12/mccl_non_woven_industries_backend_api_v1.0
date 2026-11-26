package com.mcclnonwovenindustries.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mcclnonwovenindustries.backend.entity.TuftedDetails;

@Repository 
public interface TuftedDetailsRepository extends JpaRepository<TuftedDetails, Long> {
    
}
