package com.mcclnonwovenindustries.backend.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mcclnonwovenindustries.backend.entity.PPrintDetails;
import com.mcclnonwovenindustries.backend.service.PPrintDetailsService;

@RestController 
@RequestMapping ("/api/pprint-details")
public class PPrintDetailsController {
    private final PPrintDetailsService service;

    public PPrintDetailsController(PPrintDetailsService service) {
        this.service = service;
    }

    // Save PPrint Details
    @PostMapping
    public ResponseEntity<PPrintDetails> savePPrintDetails(
            @RequestBody PPrintDetails details) {

        PPrintDetails savedDetails = service.savePPrintDetails(details);

        return new ResponseEntity<>(savedDetails, HttpStatus.CREATED);
    }

    // Get All PPrint Details
    @GetMapping
    public ResponseEntity<List<PPrintDetails>> getAllPPrintDetails() {

        return ResponseEntity.ok(service.getAllPPrintDetails());
    }

    // Get PPrint Details By ID
    @GetMapping("/{id}")
    public ResponseEntity<PPrintDetails> getPPrintDetailsById(
            @PathVariable Long id) {

        return service.getPPrintDetailsById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    // Delete PPrint Details
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePPrintDetails(
            @PathVariable Long id) {

        if (service.getPPrintDetailsById(id).isEmpty()) {
            return ResponseEntity.notFound().build();
        }

        service.deletePPrintDetails(id);

        return ResponseEntity.noContent().build();
    }
}
