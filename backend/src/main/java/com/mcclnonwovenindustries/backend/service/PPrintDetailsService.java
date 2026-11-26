package com.mcclnonwovenindustries.backend.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.mcclnonwovenindustries.backend.entity.PPrintDetails;
import com.mcclnonwovenindustries.backend.repository.PPrintDetailsRespository;

@Service 
public class PPrintDetailsService {
    private final PPrintDetailsRespository repository;

    public PPrintDetailsService(PPrintDetailsRespository repository) {
        this.repository = repository;
    }

    // Save PPrint Details
    public PPrintDetails savePPrintDetails(PPrintDetails details) {
        return repository.save(details);
    }

    // Get All PPrint Details
    public List<PPrintDetails> getAllPPrintDetails() {
        return repository.findAll();
    }

    // Get PPrint Details By ID
    public Optional<PPrintDetails> getPPrintDetailsById(Long id) {
        return repository.findById(id);
    }

    // Delete PPrint Details
    public void deletePPrintDetails(Long id) {
        repository.deleteById(id);
    }
}
