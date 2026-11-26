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

import com.mcclnonwovenindustries.backend.entity.GassYarnMachineProductionDetails;
import com.mcclnonwovenindustries.backend.service.GrassYarnMachineProductionDetailsService;

@RestController 
@RequestMapping ("/api/grass-yarn-machine-production")
public class GrassYarnMachineProductionDetailsController {
    
    private final GrassYarnMachineProductionDetailsService service;

    public GrassYarnMachineProductionDetailsController(
            GrassYarnMachineProductionDetailsService service) {
        this.service = service;
    }

    // Save production details
    @PostMapping
    public ResponseEntity<GassYarnMachineProductionDetails> saveDetails(
            @RequestBody GassYarnMachineProductionDetails details) {

        return new ResponseEntity<>(
                service.saveDetails(details),
                HttpStatus.CREATED
        );
    }

    // Get all production details
    @GetMapping
    public ResponseEntity<List<GassYarnMachineProductionDetails>> getAllDetails() {
        return ResponseEntity.ok(service.getAllDetails());
    }

    // Get production details by ID
    @GetMapping("/{id}")
    public ResponseEntity<GassYarnMachineProductionDetails> getDetailsById(
            @PathVariable Long id) {

        return ResponseEntity.ok(service.getDetailsById(id));
    }

    // Update production details
    @PutMapping("/{id}")
    public ResponseEntity<GassYarnMachineProductionDetails> updateDetails(
            @PathVariable Long id,
            @RequestBody GassYarnMachineProductionDetails details) {

        return ResponseEntity.ok(service.updateDetails(id, details));
    }

    // Delete production details
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteDetails(@PathVariable Long id) {

        service.deleteDetails(id);

        return ResponseEntity.ok("Grass Yarn Machine Production Details deleted successfully");
    }
}
