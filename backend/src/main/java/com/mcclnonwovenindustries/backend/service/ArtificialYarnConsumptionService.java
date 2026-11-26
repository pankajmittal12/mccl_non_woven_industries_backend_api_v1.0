package com.mcclnonwovenindustries.backend.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.mcclnonwovenindustries.backend.entity.ArtificialYarnConsumption;
import com.mcclnonwovenindustries.backend.repository.ArtificialYarnConsumptionRepository;

@Service 
public class ArtificialYarnConsumptionService {
    private final ArtificialYarnConsumptionRepository repository;

    public ArtificialYarnConsumptionService(
            ArtificialYarnConsumptionRepository repository) {
        this.repository = repository;
    }

    // Save Artificial Yarn Consumption
    public ArtificialYarnConsumption saveDetails(
            ArtificialYarnConsumption details) {
        return repository.save(details);
    }

    // Get All Records
    public List<ArtificialYarnConsumption> getAllDetails() {
        return repository.findAll();
    }

    // Get Record By ID
    public Optional<ArtificialYarnConsumption> getDetailsById(Long id) {
        return repository.findById(id);
    }

    // Update Record
    public ArtificialYarnConsumption updateDetails(
            Long id, ArtificialYarnConsumption updatedDetails) {

        return repository.findById(id).map(existingDetails -> {

            existingDetails.setDate(updatedDetails.getDate());
            existingDetails.setShift(updatedDetails.getShift());
            existingDetails.setMachineNo(updatedDetails.getMachineNo());
            existingDetails.setProduct(updatedDetails.getProduct());
            existingDetails.setShade(updatedDetails.getShade());
            existingDetails.setDtex(updatedDetails.getDtex());
            existingDetails.setYarnKg(updatedDetails.getYarnKg());

            return repository.save(existingDetails);

        }).orElse(null);
    }

    // Delete Record
    public boolean deleteDetails(Long id) {
        if (!repository.existsById(id)) {
            return false;
        }

        repository.deleteById(id);
        return true;
    }
}
