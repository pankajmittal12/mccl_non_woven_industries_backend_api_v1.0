package com.mcclnonwovenindustries.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mcclnonwovenindustries.backend.entity.DPrint;

public interface DPrintRepository extends JpaRepository<DPrint, Long> {
    
}
