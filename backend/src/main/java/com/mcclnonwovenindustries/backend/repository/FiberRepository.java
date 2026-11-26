package com.mcclnonwovenindustries.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mcclnonwovenindustries.backend.entity.Fiber;

@Repository 
public interface FiberRepository extends JpaRepository<Fiber, Long> {
    
}
