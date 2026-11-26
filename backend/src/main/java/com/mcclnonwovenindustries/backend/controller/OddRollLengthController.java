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

import com.mcclnonwovenindustries.backend.entity.OddRollLengthDetails;
import com.mcclnonwovenindustries.backend.service.OddRollLengthService;

@RestController 
@RequestMapping ("/api/odd-roll-length")
public class OddRollLengthController {
    
    private final OddRollLengthService service;

    public OddRollLengthController(OddRollLengthService service) {
        this.service = service;
    }

    // Save Details
    @PostMapping
    public ResponseEntity<OddRollLengthDetails> saveDetails(
            @RequestBody OddRollLengthDetails details) {

        return new ResponseEntity<>(
                service.saveDetails(details),
                HttpStatus.CREATED
        );
    }

    // Get All Details
    @GetMapping
    public ResponseEntity<List<OddRollLengthDetails>> getAllDetails() {
        return ResponseEntity.ok(service.getAllDetails());
    }

    // Get Details By ID
    @GetMapping("/{id}")
    public ResponseEntity<OddRollLengthDetails> getDetailsById(
            @PathVariable Long id) {

        return ResponseEntity.ok(service.getDetailsById(id));
    }

    // Update Details
    @PutMapping("/{id}")
    public ResponseEntity<OddRollLengthDetails> updateDetails(
            @PathVariable Long id,
            @RequestBody OddRollLengthDetails details) {

        return ResponseEntity.ok(service.updateDetails(id, details));
    }

    // Delete Details
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteDetails(@PathVariable Long id) {

        service.deleteDetails(id);

        return ResponseEntity.ok("Odd Roll Length Details deleted successfully");
    }
}
