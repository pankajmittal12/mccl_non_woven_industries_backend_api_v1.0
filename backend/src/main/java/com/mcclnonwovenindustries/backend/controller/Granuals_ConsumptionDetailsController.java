package com.mcclnonwovenindustries.backend.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mcclnonwovenindustries.backend.entity.Granuals_ConsumpotionDetails;
import com.mcclnonwovenindustries.backend.service.Granuals_ConsumptionDetailsService;

@RestController 
@RequestMapping ("/api/granuals-consumption")
public class Granuals_ConsumptionDetailsController {
    
    private final Granuals_ConsumptionDetailsService service;

    public Granuals_ConsumptionDetailsController(
            Granuals_ConsumptionDetailsService service) {
        this.service = service;
    }

    // Save consumption details
    @PostMapping
    public ResponseEntity<Granuals_ConsumpotionDetails> saveDetails(
            @RequestBody Granuals_ConsumpotionDetails details) {

        return new ResponseEntity<>(
                service.saveDetails(details),
                HttpStatus.CREATED
        );
    }

    // Get all consumption details
    @GetMapping
    public ResponseEntity<List<Granuals_ConsumpotionDetails>> getAllDetails() {
        return ResponseEntity.ok(service.getAllDetails());
    }

    // Get consumption details by ID
    @GetMapping("/{id}")
    public ResponseEntity<Granuals_ConsumpotionDetails> getDetailsById(
            @PathVariable Long id) {

        return ResponseEntity.ok(service.getDetailsById(id));
    }

    // Update consumption details
    @PutMapping("/{id}")
    public ResponseEntity<Granuals_ConsumpotionDetails> updateDetails(
            @PathVariable Long id,
            @RequestBody Granuals_ConsumpotionDetails details) {

        return ResponseEntity.ok(service.updateDetails(id, details));
    }

    // Delete consumption details
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteDetails(@PathVariable Long id) {

        service.deleteDetails(id);

        return ResponseEntity.ok(
                "Granuals Consumption Details deleted successfully"
        );
    }
}
