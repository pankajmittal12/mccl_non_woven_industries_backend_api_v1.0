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

import com.mcclnonwovenindustries.backend.entity.TotalMatScrapDetails;
import com.mcclnonwovenindustries.backend.service.TotalMatScrapDetailsService;

@RestController 
@RequestMapping ("/api/total-mat-scrap")
public class TotalMatScrapDetailsController {
    
    private final TotalMatScrapDetailsService service;

    public TotalMatScrapDetailsController(
            TotalMatScrapDetailsService service) {
        this.service = service;
    }

    // Save Details
    @PostMapping
    public ResponseEntity<TotalMatScrapDetails> saveDetails(
            @RequestBody TotalMatScrapDetails details) {

        return new ResponseEntity<>(
                service.saveDetails(details),
                HttpStatus.CREATED
        );
    }

    // Get All Details
    @GetMapping
    public ResponseEntity<List<TotalMatScrapDetails>> getAllDetails() {
        return ResponseEntity.ok(service.getAllDetails());
    }

    // Get Details By ID
    @GetMapping("/{id}")
    public ResponseEntity<TotalMatScrapDetails> getDetailsById(
            @PathVariable Long id) {

        return ResponseEntity.ok(service.getDetailsById(id));
    }

    // Update Details
    @PutMapping("/{id}")
    public ResponseEntity<TotalMatScrapDetails> updateDetails(
            @PathVariable Long id,
            @RequestBody TotalMatScrapDetails details) {

        return ResponseEntity.ok(service.updateDetails(id, details));
    }

    // Delete Details
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteDetails(@PathVariable Long id) {

        service.deleteDetails(id);

        return ResponseEntity.ok(
                "Total Mat Scrap Details deleted successfully"
        );
    }
}
