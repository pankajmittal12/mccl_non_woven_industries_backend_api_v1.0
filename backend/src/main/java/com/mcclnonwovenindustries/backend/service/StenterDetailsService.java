package com.mcclnonwovenindustries.backend.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.mcclnonwovenindustries.backend.entity.StenterDetails;
import com.mcclnonwovenindustries.backend.repository.StenterDetailsRepository;

@Service 
public class StenterDetailsService {
    private final StenterDetailsRepository repository;

    public StenterDetailsService(StenterDetailsRepository repository) {
        this.repository = repository;
    }

    // Save Stenter Details
    public StenterDetails saveStenterDetails(StenterDetails details) {
        return repository.save(details);
    }

    // Get All Stenter Details
    public List<StenterDetails> getAllStenterDetails() {
        return repository.findAll();
    }

    // Get Stenter Details By ID
    public Optional<StenterDetails> getStenterDetailsById(Long id) {
        return repository.findById(id);
    }

    // Delete Stenter Details
    public void deleteStenterDetails(Long id) {
        repository.deleteById(id);
    }
}
