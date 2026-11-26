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

import com.mcclnonwovenindustries.backend.entity.TuftedDetails;
import com.mcclnonwovenindustries.backend.service.TuftedDetailsService;

@RestController 
@RequestMapping ("/api/tufted-detailes")
public class TuftedDetailsController {
    private final TuftedDetailsService tuftedDetailsService;

    public TuftedDetailsController(
            TuftedDetailsService tuftedDetailsService) {
        this.tuftedDetailsService = tuftedDetailsService;
    }

    // Save Tufted Details
    @PostMapping
    public ResponseEntity<TuftedDetails> saveTuftedDetails(
            @RequestBody TuftedDetails details) {

        TuftedDetails savedDetails =
                tuftedDetailsService.saveTuftedDetails(details);

        return new ResponseEntity<>(
                savedDetails,
                HttpStatus.CREATED
        );
    }

    // Get All Tufted Details
    @GetMapping
    public ResponseEntity<List<TuftedDetails>> getAllTuftedDetails() {

        return ResponseEntity.ok(
                tuftedDetailsService.getAllTuftedDetails()
        );
    }

    // Get Tufted Details By ID
    @GetMapping("/{id}")
    public ResponseEntity<TuftedDetails> getTuftedDetailsById(
            @PathVariable Long id) {

        return tuftedDetailsService.getTuftedDetailsById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    // Delete Tufted Details
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTuftedDetails(
            @PathVariable Long id) {

        if (tuftedDetailsService.getTuftedDetailsById(id).isEmpty()) {
            return ResponseEntity.notFound().build();
        }

        tuftedDetailsService.deleteTuftedDetails(id);

        return ResponseEntity.noContent().build();
    }
}
