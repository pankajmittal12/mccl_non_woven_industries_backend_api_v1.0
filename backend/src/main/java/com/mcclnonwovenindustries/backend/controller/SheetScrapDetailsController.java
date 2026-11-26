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

import com.mcclnonwovenindustries.backend.entity.SheetScrapDetails;
import com.mcclnonwovenindustries.backend.service.SheetScrapDetailsService;

@RestController 
@RequestMapping ("/api/sheet-scrap")
public class SheetScrapDetailsController {
     private final SheetScrapDetailsService service;

    public SheetScrapDetailsController(SheetScrapDetailsService service) {
        this.service = service;
    }

    // Save Details
    @PostMapping
    public ResponseEntity<SheetScrapDetails> saveDetails(
            @RequestBody SheetScrapDetails details) {

        return new ResponseEntity<>(
                service.saveDetails(details),
                HttpStatus.CREATED
        );
    }

    // Get All Details
    @GetMapping
    public ResponseEntity<List<SheetScrapDetails>> getAllDetails() {
        return ResponseEntity.ok(service.getAllDetails());
    }

    // Get Details By ID
    @GetMapping("/{id}")
    public ResponseEntity<SheetScrapDetails> getDetailsById(
            @PathVariable Long id) {

        return ResponseEntity.ok(service.getDetailsById(id));
    }

    // Update Details
    @PutMapping("/{id}")
    public ResponseEntity<SheetScrapDetails> updateDetails(
            @PathVariable Long id,
            @RequestBody SheetScrapDetails details) {

        return ResponseEntity.ok(service.updateDetails(id, details));
    }

    // Delete Details
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteDetails(@PathVariable Long id) {

        service.deleteDetails(id);

        return ResponseEntity.ok(
                "Sheet Scrap Details deleted successfully"
        );
    }
}
