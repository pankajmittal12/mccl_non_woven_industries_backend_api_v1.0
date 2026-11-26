package com.mcclnonwovenindustries.backend.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mcclnonwovenindustries.backend.entity.CushionSheetProductionDetails;
import com.mcclnonwovenindustries.backend.repository.CushionSheetProductionDetailsRepository;

@Service 
public class CushionSheetProductionDetailsService {
    
    private final CushionSheetProductionDetailsRepository repository;

    public CushionSheetProductionDetailsService(
            CushionSheetProductionDetailsRepository repository) {
        this.repository = repository;
    }

    // Save Details
    public CushionSheetProductionDetails saveDetails(
            CushionSheetProductionDetails details) {
        return repository.save(details);
    }

    // Get All Details
    public List<CushionSheetProductionDetails> getAllDetails() {
        return repository.findAll();
    }

    // Get Details By ID
    public CushionSheetProductionDetails getDetailsById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException(
                        "Details not found with id: " + id));
    }

    // Update Details
    public CushionSheetProductionDetails updateDetails(
            Long id, CushionSheetProductionDetails updatedDetails) {

        CushionSheetProductionDetails existingDetails = getDetailsById(id);

        existingDetails.setDate(updatedDetails.getDate());
        existingDetails.setShift(updatedDetails.getShift());
        existingDetails.setMachineNo(updatedDetails.getMachineNo());
        existingDetails.setProduct(updatedDetails.getProduct());
        existingDetails.setShade(updatedDetails.getShade());
        existingDetails.setGsm(updatedDetails.getGsm());
        existingDetails.setWidth(updatedDetails.getWidth());
        existingDetails.setRmtr(updatedDetails.getRmtr());
        existingDetails.setRollQty(updatedDetails.getRollQty());
        existingDetails.setWt(updatedDetails.getWt());

        return repository.save(existingDetails);
    }

    // Delete Details
    public void deleteDetails(Long id) {
        CushionSheetProductionDetails existingDetails = getDetailsById(id);
        repository.delete(existingDetails);
    }
}
