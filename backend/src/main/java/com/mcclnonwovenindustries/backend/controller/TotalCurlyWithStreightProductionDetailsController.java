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

import com.mcclnonwovenindustries.backend.entity.TotalCurlyWithStreightProductionDetails;
import com.mcclnonwovenindustries.backend.service.TotalCurlyWithStreightDetailsService;

@RestController 
@RequestMapping ("/api/total-curly-with-streight-production")
public class TotalCurlyWithStreightProductionDetailsController {
    
    private final TotalCurlyWithStreightDetailsService service;

    public TotalCurlyWithStreightProductionDetailsController(
            TotalCurlyWithStreightDetailsService service) {
        this.service = service;
    }

    // Save production details
    @PostMapping
    public ResponseEntity<TotalCurlyWithStreightProductionDetails> saveDetails(
            @RequestBody TotalCurlyWithStreightProductionDetails details) {

        return new ResponseEntity<>(
                service.saveDetails(details),
                HttpStatus.CREATED
        );
    }

    // Get all production details
    @GetMapping
    public ResponseEntity<List<TotalCurlyWithStreightProductionDetails>> getAllDetails() {
        return ResponseEntity.ok(service.getAllDetails());
    }

    // Get production details by ID
    @GetMapping("/{id}")
    public ResponseEntity<TotalCurlyWithStreightProductionDetails> getDetailsById(
            @PathVariable Long id) {

        return ResponseEntity.ok(service.getDetailsById(id));
    }

    // Update production details
    @PutMapping("/{id}")
    public ResponseEntity<TotalCurlyWithStreightProductionDetails> updateDetails(
            @PathVariable Long id,
            @RequestBody TotalCurlyWithStreightProductionDetails details) {

        return ResponseEntity.ok(service.updateDetails(id, details));
    }

    // Delete production details
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteDetails(@PathVariable Long id) {

        service.deleteDetails(id);

        return ResponseEntity.ok(
                "Total Curly With Streight Production Details deleted successfully"
        );
    }
}
