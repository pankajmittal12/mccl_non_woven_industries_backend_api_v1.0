package com.mcclnonwovenindustries.backend.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mcclnonwovenindustries.backend.entity.TotalMatScrapDetails;
import com.mcclnonwovenindustries.backend.repository.TotalMatScrapDetailsRepository;

@Service 
public class TotalMatScrapDetailsService {
     private final TotalMatScrapDetailsRepository repository;

    public TotalMatScrapDetailsService(TotalMatScrapDetailsRepository repository) {
        this.repository = repository;
    }

    // Save Details
    public TotalMatScrapDetails saveDetails(TotalMatScrapDetails details) {
        return repository.save(details);
    }

    // Get All Details
    public List<TotalMatScrapDetails> getAllDetails() {
        return repository.findAll();
    }

    // Get Details By ID
    public TotalMatScrapDetails getDetailsById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException(
                        "Details not found with id: " + id));
    }

    // Update Details
    public TotalMatScrapDetails updateDetails(
            Long id, TotalMatScrapDetails updatedDetails) {

        TotalMatScrapDetails existingDetails = getDetailsById(id);

        existingDetails.setDate(updatedDetails.getDate());
        existingDetails.setShift(updatedDetails.getShift());
        existingDetails.setTotalWt(updatedDetails.getTotalWt());

        return repository.save(existingDetails);
    }

    // Delete Details
    public void deleteDetails(Long id) {
        TotalMatScrapDetails existingDetails = getDetailsById(id);
        repository.delete(existingDetails);
    }
}
