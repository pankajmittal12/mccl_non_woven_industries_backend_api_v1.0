package com.mcclnonwovenindustries.backend.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mcclnonwovenindustries.backend.entity.GassYarnMachineProductionDetails;
import com.mcclnonwovenindustries.backend.repository.GrassYarnMachineProductionDetailsRepository;

@Service 
public class GrassYarnMachineProductionDetailsService {
    
    private final GrassYarnMachineProductionDetailsRepository repository;

    public GrassYarnMachineProductionDetailsService(
            GrassYarnMachineProductionDetailsRepository repository) {
        this.repository = repository;
    }

    // Save Details
    public GassYarnMachineProductionDetails saveDetails(
            GassYarnMachineProductionDetails details) {
        return repository.save(details);
    }

    // Get All Details
    public List<GassYarnMachineProductionDetails> getAllDetails() {
        return repository.findAll();
    }

    // Get Details By ID
    public GassYarnMachineProductionDetails getDetailsById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException(
                        "Details not found with id: " + id));
    }

    // Update Details
    public GassYarnMachineProductionDetails updateDetails(
            Long id,
            GassYarnMachineProductionDetails updatedDetails) {

        GassYarnMachineProductionDetails existingDetails =
                getDetailsById(id);

        existingDetails.setDate(updatedDetails.getDate());
        existingDetails.setShift(updatedDetails.getShift());
        existingDetails.setMachineNo(updatedDetails.getMachineNo());
        existingDetails.setProduct(updatedDetails.getProduct());
        existingDetails.setShade(updatedDetails.getShade());
        existingDetails.setDtex(updatedDetails.getDtex());
        existingDetails.setBobbinQty(updatedDetails.getBobbinQty());
        existingDetails.setGWt(updatedDetails.getGWt());
        existingDetails.setNWt(updatedDetails.getNWt());

        return repository.save(existingDetails);
    }

    // Delete Details
    public void deleteDetails(Long id) {
        GassYarnMachineProductionDetails existingDetails =
                getDetailsById(id);

        repository.delete(existingDetails);
    }
}
