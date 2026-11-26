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

import com.mcclnonwovenindustries.backend.entity.TotalCurlyYarnProduction;
import com.mcclnonwovenindustries.backend.service.TotalCurlyYarnProductionService;

@RestController 
@RequestMapping ("/api/total-curly-yarn-production")
public class TotalCurlyYarnProductionController {
    
    private final TotalCurlyYarnProductionService service;

    public TotalCurlyYarnProductionController(
            TotalCurlyYarnProductionService service) {
        this.service = service;
    }

    // Save production details
    @PostMapping
    public ResponseEntity<TotalCurlyYarnProduction> saveDetails(
            @RequestBody TotalCurlyYarnProduction details) {

        return new ResponseEntity<>(
                service.saveDetails(details),
                HttpStatus.CREATED
        );
    }

    // Get all production details
    @GetMapping
    public ResponseEntity<List<TotalCurlyYarnProduction>> getAllDetails() {
        return ResponseEntity.ok(service.getAllDetails());
    }

    // Get production details by ID
    @GetMapping("/{id}")
    public ResponseEntity<TotalCurlyYarnProduction> getDetailsById(
            @PathVariable Long id) {

        return ResponseEntity.ok(service.getDetailsById(id));
    }

    // Update production details
    @PutMapping("/{id}")
    public ResponseEntity<TotalCurlyYarnProduction> updateDetails(
            @PathVariable Long id,
            @RequestBody TotalCurlyYarnProduction details) {

        return ResponseEntity.ok(service.updateDetails(id, details));
    }

    // Delete production details
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteDetails(@PathVariable Long id) {

        service.deleteDetails(id);

        return ResponseEntity.ok(
                "Total Curly Yarn Production deleted successfully"
        );
    }
}
