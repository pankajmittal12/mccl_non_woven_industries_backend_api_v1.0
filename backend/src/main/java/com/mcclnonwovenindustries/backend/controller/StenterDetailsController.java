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

import com.mcclnonwovenindustries.backend.entity.StenterDetails;
import com.mcclnonwovenindustries.backend.service.StenterDetailsService;

@RestController
@RequestMapping ("/api/stenter-details")
public class StenterDetailsController {
     private final StenterDetailsService service;

    public StenterDetailsController(StenterDetailsService service) {
        this.service = service;
    }

    // Save Stenter Details
    @PostMapping
    public ResponseEntity<StenterDetails> saveStenterDetails(
            @RequestBody StenterDetails details) {

        StenterDetails savedDetails = service.saveStenterDetails(details);

        return new ResponseEntity<>(savedDetails, HttpStatus.CREATED);
    }

    // Get All Stenter Details
    @GetMapping
    public ResponseEntity<List<StenterDetails>> getAllStenterDetails() {

        List<StenterDetails> details = service.getAllStenterDetails();

        return ResponseEntity.ok(details);
    }

    // Get Stenter Details By ID
    @GetMapping("/{id}")
    public ResponseEntity<StenterDetails> getStenterDetailsById(
            @PathVariable Long id) {

        Optional<StenterDetails> details = service.getStenterDetailsById(id);

        return details
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    // Delete Stenter Details
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteStenterDetails(
            @PathVariable Long id) {

        if (service.getStenterDetailsById(id).isEmpty()) {
            return ResponseEntity.notFound().build();
        }

        service.deleteStenterDetails(id);

        return ResponseEntity.noContent().build();
    }
}
