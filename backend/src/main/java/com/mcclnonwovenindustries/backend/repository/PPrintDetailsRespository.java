package com.mcclnonwovenindustries.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mcclnonwovenindustries.backend.entity.PPrintDetails;

@Repository 
public interface PPrintDetailsRespository extends JpaRepository<PPrintDetails, Long> {
    
}
