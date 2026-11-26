package com.mcclnonwovenindustries.backend.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mcclnonwovenindustries.backend.entity.ChemicalBatchDetails;
import com.mcclnonwovenindustries.backend.service.ChemicalBatchDetailsService;

@RestController 
@RequestMapping ("/api/chemical-batch-details")
public class ChemichalBatchDetailsController {
    private final ChemicalBatchDetailsService service;

    public ChemichalBatchDetailsController(
            ChemicalBatchDetailsService service) {
        this.service = service;
    }

    // Save Chemical Batch Details
    @PostMapping
    public ResponseEntity<ChemicalBatchDetails> saveChemicalBatchDetails(
            @RequestBody ChemicalBatchDetails details) {

        ChemicalBatchDetails savedDetails =
                service.saveChemicalBatchDetails(details);

        return new ResponseEntity<>(
                savedDetails, HttpStatus.CREATED);
    }

    // Get All Chemical Batch Details
    @GetMapping
    public ResponseEntity<List<ChemicalBatchDetails>> getAllChemicalBatchDetails() {

        return ResponseEntity.ok(
                service.getAllChemicalBatchDetails());
    }

    // Get Chemical Batch Details By ID
    @GetMapping("/{id}")
    public ResponseEntity<ChemicalBatchDetails> getChemicalBatchDetailsById(
            @PathVariable Long id) {

        Optional<ChemicalBatchDetails> details =
                service.getChemicalBatchDetailsById(id);

        return details
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    // Delete Chemical Batch Details
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteChemicalBatchDetails(
            @PathVariable Long id) {

        if (service.getChemicalBatchDetailsById(id).isEmpty()) {
            return ResponseEntity.notFound().build();
        }

        service.deleteChemicalBatchDetails(id);

        return ResponseEntity.noContent().build();
    }
}
