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

import com.mcclnonwovenindustries.backend.entity.CushionSheetProductionDetails;
import com.mcclnonwovenindustries.backend.service.CushionSheetProductionDetailsService;

@RestController 
@RequestMapping ("/api/cushion-sheet-production")
public class CushionSheetProductionDetailsController {
     private final CushionSheetProductionDetailsService service;

    public CushionSheetProductionDetailsController(
            CushionSheetProductionDetailsService service) {
        this.service = service;
    }

    // Save Details
    @PostMapping
    public ResponseEntity<CushionSheetProductionDetails> saveDetails(
            @RequestBody CushionSheetProductionDetails details) {

        return new ResponseEntity<>(
                service.saveDetails(details),
                HttpStatus.CREATED
        );
    }

    // Get All Details
    @GetMapping
    public ResponseEntity<List<CushionSheetProductionDetails>> getAllDetails() {
        return ResponseEntity.ok(service.getAllDetails());
    }

    // Get Details By ID
    @GetMapping("/{id}")
    public ResponseEntity<CushionSheetProductionDetails> getDetailsById(
            @PathVariable Long id) {

        return ResponseEntity.ok(service.getDetailsById(id));
    }

    // Update Details
    @PutMapping("/{id}")
    public ResponseEntity<CushionSheetProductionDetails> updateDetails(
            @PathVariable Long id,
            @RequestBody CushionSheetProductionDetails details) {

        return ResponseEntity.ok(service.updateDetails(id, details));
    }

    // Delete Details
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteDetails(@PathVariable Long id) {

        service.deleteDetails(id);

        return ResponseEntity.ok(
                "Cushion Sheet Production Details deleted successfully"
        );
    }
}
