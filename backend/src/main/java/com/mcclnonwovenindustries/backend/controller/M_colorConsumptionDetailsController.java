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

import com.mcclnonwovenindustries.backend.entity.M_colorConsumptionDetails;
import com.mcclnonwovenindustries.backend.service.M_colorConsumptionDetailsService;

@RestController 
@RequestMapping ("/api/m-color-consumption")
public class M_colorConsumptionDetailsController {
    
    private final M_colorConsumptionDetailsService service;

    public M_colorConsumptionDetailsController(
            M_colorConsumptionDetailsService service) {
        this.service = service;
    }

    // Save consumption details
    @PostMapping
    public ResponseEntity<M_colorConsumptionDetails> saveDetails(
            @RequestBody M_colorConsumptionDetails details) {

        return new ResponseEntity<>(
                service.saveDetails(details),
                HttpStatus.CREATED
        );
    }

    // Get all consumption details
    @GetMapping
    public ResponseEntity<List<M_colorConsumptionDetails>> getAllDetails() {
        return ResponseEntity.ok(service.getAllDetails());
    }

    // Get consumption details by ID
    @GetMapping("/{id}")
    public ResponseEntity<M_colorConsumptionDetails> getDetailsById(
            @PathVariable Long id) {

        return ResponseEntity.ok(service.getDetailsById(id));
    }

    // Update consumption details
    @PutMapping("/{id}")
    public ResponseEntity<M_colorConsumptionDetails> updateDetails(
            @PathVariable Long id,
            @RequestBody M_colorConsumptionDetails details) {

        return ResponseEntity.ok(service.updateDetails(id, details));
    }

    // Delete consumption details
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteDetails(@PathVariable Long id) {

        service.deleteDetails(id);

        return ResponseEntity.ok(
                "M. Color Consumption Details deleted successfully"
        );
    }
}
