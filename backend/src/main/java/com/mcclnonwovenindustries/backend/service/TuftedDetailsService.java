package com.mcclnonwovenindustries.backend.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.mcclnonwovenindustries.backend.entity.TuftedDetails;
import com.mcclnonwovenindustries.backend.repository.TuftedDetailsRepository;

@Service
public class TuftedDetailsService {
    private final TuftedDetailsRepository tuftedDetailsRepository;

    public TuftedDetailsService(
            TuftedDetailsRepository tuftedDetailsRepository) {
        this.tuftedDetailsRepository = tuftedDetailsRepository;
    }

    // Save Tufted Details
    public TuftedDetails saveTuftedDetails(TuftedDetails details) {
        return tuftedDetailsRepository.save(details);
    }

    // Get All Tufted Details
    public List<TuftedDetails> getAllTuftedDetails() {
        return tuftedDetailsRepository.findAll();
    }

    // Get Tufted Details By ID
    public Optional<TuftedDetails> getTuftedDetailsById(Long id) {
        return tuftedDetailsRepository.findById(id);
    }

    // Delete Tufted Details
    public void deleteTuftedDetails(Long id) {
        tuftedDetailsRepository.deleteById(id);
    }
}
