package com.mcclnonwovenindustries.backend.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mcclnonwovenindustries.backend.entity.TotalCurlyWithStreightProductionDetails;
import com.mcclnonwovenindustries.backend.repository.TotalCurlyWithStreightProductionDetailsRepository;

@Service 
public class TotalCurlyWithStreightDetailsService {
    
    private final TotalCurlyWithStreightProductionDetailsRepository repository;

    public TotalCurlyWithStreightDetailsService(
            TotalCurlyWithStreightProductionDetailsRepository repository) {
        this.repository = repository;
    }

    // Save production details
    public TotalCurlyWithStreightProductionDetails saveDetails(
            TotalCurlyWithStreightProductionDetails details) {
        return repository.save(details);
    }

    // Get all production details
    public List<TotalCurlyWithStreightProductionDetails> getAllDetails() {
        return repository.findAll();
    }

    // Get production details by ID
    public TotalCurlyWithStreightProductionDetails getDetailsById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException(
                        "Details not found with id: " + id));
    }

    // Update production details
    public TotalCurlyWithStreightProductionDetails updateDetails(
            Long id,
            TotalCurlyWithStreightProductionDetails updatedDetails) {

        TotalCurlyWithStreightProductionDetails existingDetails =
                getDetailsById(id);

        existingDetails.setDate(updatedDetails.getDate());
        existingDetails.setTotal(updatedDetails.getTotal());

        return repository.save(existingDetails);
    }

    // Delete production details
    public void deleteDetails(Long id) {
        TotalCurlyWithStreightProductionDetails existingDetails =
                getDetailsById(id);

        repository.delete(existingDetails);
    }
}
