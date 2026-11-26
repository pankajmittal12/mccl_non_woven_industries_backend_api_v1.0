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

import com.mcclnonwovenindustries.backend.entity.ArtificialYarnConsumption;
import com.mcclnonwovenindustries.backend.service.ArtificialYarnConsumptionService;

@RestController 
@RequestMapping ("/api/artificial-yarn-consumption")
public class ArtificialYarnConsumptionController {
    private final ArtificialYarnConsumptionService service;

    public ArtificialYarnConsumptionController(
            ArtificialYarnConsumptionService service) {
        this.service = service;
    }

    // Save Details
    @PostMapping
    public ResponseEntity<ArtificialYarnConsumption> saveDetails(
            @RequestBody ArtificialYarnConsumption details) {

        ArtificialYarnConsumption savedDetails =
                service.saveDetails(details);

        return new ResponseEntity<>(savedDetails, HttpStatus.CREATED);
    }

    // Get All Details
    @GetMapping
    public ResponseEntity<List<ArtificialYarnConsumption>> getAllDetails() {

        return ResponseEntity.ok(service.getAllDetails());
    }

    // Get Details By ID
    @GetMapping("/{id}")
    public ResponseEntity<ArtificialYarnConsumption> getDetailsById(
            @PathVariable Long id) {

        return service.getDetailsById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    // Update Details
    @PutMapping("/{id}")
    public ResponseEntity<ArtificialYarnConsumption> updateDetails(
            @PathVariable Long id,
            @RequestBody ArtificialYarnConsumption details) {

        ArtificialYarnConsumption updatedDetails =
                service.updateDetails(id, details);

        if (updatedDetails == null) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(updatedDetails);
    }

    // Delete Details
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteDetails(
            @PathVariable Long id) {

        boolean deleted = service.deleteDetails(id);

        if (!deleted) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.noContent().build();
    }
}
