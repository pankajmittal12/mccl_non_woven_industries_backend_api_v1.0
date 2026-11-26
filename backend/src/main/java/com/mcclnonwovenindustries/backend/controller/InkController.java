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

import com.mcclnonwovenindustries.backend.entity.InkConsumption;
import com.mcclnonwovenindustries.backend.service.InkConsumptionService;

@RestController 
@RequestMapping ("/api/ink-consumption")
public class InkController {
    private final InkConsumptionService inkConsumptionService;

    public InkController(
            InkConsumptionService inkConsumptionService) {
        this.inkConsumptionService = inkConsumptionService;
    }

    // Save Ink Consumption
    @PostMapping
    public ResponseEntity<InkConsumption> saveInkConsumption(
            @RequestBody InkConsumption inkConsumption) {

        InkConsumption savedData =
                inkConsumptionService.saveInkConsumption(inkConsumption);

        return new ResponseEntity<>(savedData, HttpStatus.CREATED);
    }

    // Get All Ink Consumption Records
    @GetMapping
    public ResponseEntity<List<InkConsumption>> getAllInkConsumption() {

        return ResponseEntity.ok(
                inkConsumptionService.getAllInkConsumption()
        );
    }

    // Get Ink Consumption By ID
    @GetMapping("/{id}")
    public ResponseEntity<InkConsumption> getInkConsumptionById(
            @PathVariable Long id) {

        Optional<InkConsumption> data =
                inkConsumptionService.getInkConsumptionById(id);

        return data.map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    // Delete Ink Consumption
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteInkConsumption(
            @PathVariable Long id) {

        inkConsumptionService.deleteInkConsumption(id);

        return ResponseEntity.noContent().build();
    }
}
