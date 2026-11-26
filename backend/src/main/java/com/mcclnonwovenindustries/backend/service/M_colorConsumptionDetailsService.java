package com.mcclnonwovenindustries.backend.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mcclnonwovenindustries.backend.entity.M_colorConsumptionDetails;
import com.mcclnonwovenindustries.backend.repository.M_colorConsumptionDetailsRepository;

@Service 
public class M_colorConsumptionDetailsService {
    
    private final M_colorConsumptionDetailsRepository repository;

    public M_colorConsumptionDetailsService(
            M_colorConsumptionDetailsRepository repository) {
        this.repository = repository;
    }

    // Save consumption details
    public M_colorConsumptionDetails saveDetails(
            M_colorConsumptionDetails details) {
        return repository.save(details);
    }

    // Get all consumption details
    public List<M_colorConsumptionDetails> getAllDetails() {
        return repository.findAll();
    }

    // Get consumption details by ID
    public M_colorConsumptionDetails getDetailsById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException(
                        "Details not found with id: " + id));
    }

    // Update consumption details
    public M_colorConsumptionDetails updateDetails(
            Long id, M_colorConsumptionDetails updatedDetails) {

        M_colorConsumptionDetails existingDetails = getDetailsById(id);

        existingDetails.setDate(updatedDetails.getDate());
        existingDetails.setMColorTitle(updatedDetails.getMColorTitle());
        existingDetails.setMColor(updatedDetails.getMColor());
        existingDetails.setMGrey(updatedDetails.getMGrey());
        existingDetails.setMBlack(updatedDetails.getMBlack());
        existingDetails.setMYellow(updatedDetails.getMYellow());
        existingDetails.setMWhite(updatedDetails.getMWhite());
        existingDetails.setMOrange(updatedDetails.getMOrange());
        existingDetails.setMBrowan(updatedDetails.getMBrowan());
        existingDetails.setMNatural(updatedDetails.getMNatural());
        existingDetails.setMLightgreen(updatedDetails.getMLightgreen());
        existingDetails.setMDarkgreen(updatedDetails.getMDarkgreen());
        existingDetails.setMBlue(updatedDetails.getMBlue());
        existingDetails.setMRed(updatedDetails.getMRed());
        existingDetails.setTotal(updatedDetails.getTotal());

        return repository.save(existingDetails);
    }

    // Delete consumption details
    public void deleteDetails(Long id) {
        M_colorConsumptionDetails existingDetails = getDetailsById(id);
        repository.delete(existingDetails);
    }
}
