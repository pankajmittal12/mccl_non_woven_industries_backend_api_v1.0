package com.mcclnonwovenindustries.backend.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mcclnonwovenindustries.backend.entity.TotalCurlyYarnProduction;
import com.mcclnonwovenindustries.backend.repository.TotalCurlyYarnProductionRepository;

@Service 
public class TotalCurlyYarnProductionService {
    
    private final TotalCurlyYarnProductionRepository repository;

    public TotalCurlyYarnProductionService(
            TotalCurlyYarnProductionRepository repository) {
        this.repository = repository;
    }

    // Save production details
    public TotalCurlyYarnProduction saveDetails(TotalCurlyYarnProduction details) {
        return repository.save(details);
    }

    // Get all production details
    public List<TotalCurlyYarnProduction> getAllDetails() {
        return repository.findAll();
    }

    // Get production details by ID
    public TotalCurlyYarnProduction getDetailsById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException(
                        "Details not found with id: " + id));
    }

    // Update production details
    public TotalCurlyYarnProduction updateDetails(
            Long id, TotalCurlyYarnProduction updatedDetails) {

        TotalCurlyYarnProduction existingDetails = getDetailsById(id);

        existingDetails.setDate(updatedDetails.getDate());
        existingDetails.setTotalProduction(updatedDetails.getTotalProduction());

        return repository.save(existingDetails);
    }

    // Delete production details
    public void deleteDetails(Long id) {
        TotalCurlyYarnProduction existingDetails = getDetailsById(id);
        repository.delete(existingDetails);
    }
}
