package com.mcclnonwovenindustries.backend.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.mcclnonwovenindustries.backend.entity.CusionMatDetails;
import com.mcclnonwovenindustries.backend.repository.CusionMatDetailsRepository;

@Service 
public class CusionMatDetailsService {
    private final CusionMatDetailsRepository repository;

    public CusionMatDetailsService(CusionMatDetailsRepository repository) {
        this.repository = repository;
    }

    // Save Details
    public CusionMatDetails saveDetails(CusionMatDetails details) {
        return repository.save(details);
    }

    // Get All Details
    public List<CusionMatDetails> getAllDetails() {
        return repository.findAll();
    }

    // Get Details By ID
    public Optional<CusionMatDetails> getDetailsById(Long id) {
        return repository.findById(id);
    }

    // Update Details
    public CusionMatDetails updateDetails(
            Long id, CusionMatDetails updatedDetails) {

        return repository.findById(id).map(existingDetails -> {

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
            existingDetails.setTotalWt(updatedDetails.getTotalWt());

            return repository.save(existingDetails);

        }).orElse(null);
    }

    // Delete Details
    public boolean deleteDetails(Long id) {

        if (!repository.existsById(id)) {
            return false;
        }

        repository.deleteById(id);
        return true;
    }
}
