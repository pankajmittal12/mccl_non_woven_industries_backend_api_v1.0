package com.mcclnonwovenindustries.backend.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mcclnonwovenindustries.backend.entity.CardsDetails;
import com.mcclnonwovenindustries.backend.service.CardDetailsService;

@RestController
@RequestMapping("/api/card-production")
public class CardDetailsController {
     private final CardDetailsService cardDetailsService;

    public CardDetailsController(CardDetailsService cardDetailsService) {
        this.cardDetailsService = cardDetailsService;
    }

    // Save production record
    @PostMapping
    public ResponseEntity<CardsDetails> saveProduction(
            @RequestBody CardsDetails cardDetails) {

        CardsDetails saved = cardDetailsService.saveProduction(cardDetails);

        return ResponseEntity.status(HttpStatus.CREATED).body(saved);
    }

    // Get all production records
    @GetMapping
    public ResponseEntity<List<CardsDetails>> getAllProduction() {

        return ResponseEntity.ok(
                cardDetailsService.getAllProduction()
        );
    }

    // Get production record by ID
    @GetMapping("/{id}")
    public ResponseEntity<CardsDetails> getProductionById(
            @PathVariable Long id) {

        return cardDetailsService.getProductionById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    // Delete production record
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteProduction(@PathVariable Long id) {

        cardDetailsService.deleteProduction(id);

        return ResponseEntity.noContent().build();
    }
}
