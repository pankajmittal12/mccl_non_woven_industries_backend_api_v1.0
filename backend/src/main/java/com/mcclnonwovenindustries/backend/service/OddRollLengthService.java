package com.mcclnonwovenindustries.backend.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mcclnonwovenindustries.backend.entity.OddRollLengthDetails;
import com.mcclnonwovenindustries.backend.repository.OddRollLengthDetailsRepository;

@Service 
public class OddRollLengthService {
    private final OddRollLengthDetailsRepository repository;

    public OddRollLengthService(OddRollLengthDetailsRepository repository) {
        this.repository = repository;
    }

    // Save Details
    public OddRollLengthDetails saveDetails(OddRollLengthDetails details) {
        return repository.save(details);
    }

    // Get All Details
    public List<OddRollLengthDetails> getAllDetails() {
        return repository.findAll();
    }

    // Get Details By ID
    public OddRollLengthDetails getDetailsById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Details not found with id: " + id));
    }

    // Update Details
    public OddRollLengthDetails updateDetails(Long id, OddRollLengthDetails updatedDetails) {

        OddRollLengthDetails existingDetails = getDetailsById(id);

        existingDetails.setDate(updatedDetails.getDate());
        existingDetails.setShift(updatedDetails.getShift());
        existingDetails.setRollMtr(updatedDetails.getRollMtr());
        existingDetails.setTotalWt(updatedDetails.getTotalWt());

        return repository.save(existingDetails);
    }

    // Delete Details
    public void deleteDetails(Long id) {
        OddRollLengthDetails existingDetails = getDetailsById(id);
        repository.delete(existingDetails);
    }
}
