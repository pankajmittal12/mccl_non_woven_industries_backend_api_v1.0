package com.mcclnonwovenindustries.backend.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mcclnonwovenindustries.backend.entity.Granuals_ConsumpotionDetails;
import com.mcclnonwovenindustries.backend.repository.Granuals_ConsumptionDetailsRepository;

@Service 
public class Granuals_ConsumptionDetailsService {
    
    private final Granuals_ConsumptionDetailsRepository repository;

    public Granuals_ConsumptionDetailsService(
            Granuals_ConsumptionDetailsRepository repository) {
        this.repository = repository;
    }

    // Save consumption details
    public Granuals_ConsumpotionDetails saveDetails(
            Granuals_ConsumpotionDetails details) {
        return repository.save(details);
    }

    // Get all consumption details
    public List<Granuals_ConsumpotionDetails> getAllDetails() {
        return repository.findAll();
    }

    // Get consumption details by ID
    public Granuals_ConsumpotionDetails getDetailsById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException(
                        "Details not found with id: " + id));
    }

    // Update consumption details
    public Granuals_ConsumpotionDetails updateDetails(
            Long id, Granuals_ConsumpotionDetails updatedDetails) {

        Granuals_ConsumpotionDetails existingDetails = getDetailsById(id);

        existingDetails.setDate(updatedDetails.getDate());
        existingDetails.setGranualTitle(updatedDetails.getGranualTitle());
        existingDetails.setGranual(updatedDetails.getGranual());
        existingDetails.setLldpe(updatedDetails.getLldpe());
        existingDetails.setPp(updatedDetails.getPp());
        existingDetails.setHdpe(updatedDetails.getHdpe());
        existingDetails.setPpa(updatedDetails.getPpa());
        existingDetails.setUb(updatedDetails.getUb());
        existingDetails.setOb(updatedDetails.getOb());
        existingDetails.setMb(updatedDetails.getMb());
        existingDetails.setTotal(updatedDetails.getTotal());
        existingDetails.setScrap(updatedDetails.getScrap());

        return repository.save(existingDetails);
    }

    // Delete consumption details
    public void deleteDetails(Long id) {
        Granuals_ConsumpotionDetails existingDetails = getDetailsById(id);
        repository.delete(existingDetails);
    }
}
