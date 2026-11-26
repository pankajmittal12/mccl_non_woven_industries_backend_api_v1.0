package com.mcclnonwovenindustries.backend.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.mcclnonwovenindustries.backend.entity.CardsDetails;
import com.mcclnonwovenindustries.backend.repository.CardDetailsRepository;

@Service 
public class CardDetailsService {
    private final CardDetailsRepository cardDetailsRepository;

    public CardDetailsService(CardDetailsRepository cardDetailsRepository) {
        this.cardDetailsRepository = cardDetailsRepository;
    }

    // Save production record
    public CardsDetails saveProduction(CardsDetails cardDetails) {
        return cardDetailsRepository.save(cardDetails);
    }

    // Get all production records
    public List<CardsDetails> getAllProduction() {
        return cardDetailsRepository.findAll();
    }

    // Get production record by ID
    public Optional<CardsDetails> getProductionById(Long id) {
        return cardDetailsRepository.findById(id);
    }

    // Delete production record
    public void deleteProduction(Long id) {
        cardDetailsRepository.deleteById(id);
    }

    // Count total production records
    public long countProduction() {
        return cardDetailsRepository.count();
    }
}
