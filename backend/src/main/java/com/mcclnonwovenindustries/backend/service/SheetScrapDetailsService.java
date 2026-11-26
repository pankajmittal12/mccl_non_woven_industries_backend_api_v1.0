package com.mcclnonwovenindustries.backend.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mcclnonwovenindustries.backend.entity.SheetScrapDetails;
import com.mcclnonwovenindustries.backend.repository.SheetScrapDetailsRepository;

@Service 
public class SheetScrapDetailsService {
     private final SheetScrapDetailsRepository repository;

    public SheetScrapDetailsService(SheetScrapDetailsRepository repository) {
        this.repository = repository;
    }

    // Save Details
    public SheetScrapDetails saveDetails(SheetScrapDetails details) {
        return repository.save(details);
    }

    // Get All Details
    public List<SheetScrapDetails> getAllDetails() {
        return repository.findAll();
    }

    // Get Details By ID
    public SheetScrapDetails getDetailsById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException(
                        "Details not found with id: " + id));
    }

    // Update Details
    public SheetScrapDetails updateDetails(
            Long id, SheetScrapDetails updatedDetails) {

        SheetScrapDetails existingDetails = getDetailsById(id);

        existingDetails.setDate(updatedDetails.getDate());
        existingDetails.setShift(updatedDetails.getShift());
        existingDetails.setTotalWt(updatedDetails.getTotalWt());

        return repository.save(existingDetails);
    }

    // Delete Details
    public void deleteDetails(Long id) {
        SheetScrapDetails existingDetails = getDetailsById(id);
        repository.delete(existingDetails);
    }
}
