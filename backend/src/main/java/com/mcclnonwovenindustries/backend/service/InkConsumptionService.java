package com.mcclnonwovenindustries.backend.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.mcclnonwovenindustries.backend.entity.InkConsumption;
import com.mcclnonwovenindustries.backend.repository.InkConsumptionRepository;

@Service 
public class InkConsumptionService {
    private final InkConsumptionRepository inkConsumptionRepository;

    public InkConsumptionService(
            InkConsumptionRepository inkConsumptionRepository) {
        this.inkConsumptionRepository = inkConsumptionRepository;
    }

    // Save Ink Consumption
    public InkConsumption saveInkConsumption(InkConsumption inkConsumption) {
        return inkConsumptionRepository.save(inkConsumption);
    }

    // Get All Ink Consumption Records
    public List<InkConsumption> getAllInkConsumption() {
        return inkConsumptionRepository.findAll();
    }

    // Get Ink Consumption By ID
    public Optional<InkConsumption> getInkConsumptionById(Long id) {
        return inkConsumptionRepository.findById(id);
    }

    // Delete Ink Consumption
    public void deleteInkConsumption(Long id) {
        inkConsumptionRepository.deleteById(id);
    }
}
