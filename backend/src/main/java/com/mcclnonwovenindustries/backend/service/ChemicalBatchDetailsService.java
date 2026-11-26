package com.mcclnonwovenindustries.backend.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.mcclnonwovenindustries.backend.entity.ChemicalBatchDetails;
import com.mcclnonwovenindustries.backend.repository.ChemicalBatchDetailsRepositiory;

@Service 
public class ChemicalBatchDetailsService {
     private final ChemicalBatchDetailsRepositiory repository;

    public ChemicalBatchDetailsService(
            ChemicalBatchDetailsRepositiory repository) {
        this.repository = repository;
    }

    // Save Chemical Batch Details
    public ChemicalBatchDetails saveChemicalBatchDetails(
            ChemicalBatchDetails details) {
        return repository.save(details);
    }

    // Get All Chemical Batch Details
    public List<ChemicalBatchDetails> getAllChemicalBatchDetails() {
        return repository.findAll();
    }

    // Get Chemical Batch Details By ID
    public Optional<ChemicalBatchDetails> getChemicalBatchDetailsById(
            Long id) {
        return repository.findById(id);
    }

    // Delete Chemical Batch Details
    public void deleteChemicalBatchDetails(Long id) {
        repository.deleteById(id);
    }
}
