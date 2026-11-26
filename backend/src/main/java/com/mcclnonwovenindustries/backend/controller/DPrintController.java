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

import com.mcclnonwovenindustries.backend.entity.DPrint;
import com.mcclnonwovenindustries.backend.service.DPrintService;

@RestController 
@RequestMapping("/api/dprint")
public class DPrintController {
    private final DPrintService dPrintService;

    public DPrintController(DPrintService dPrintService) {
        this.dPrintService = dPrintService;
    }

    // Save D.Print production data
    @PostMapping
    public ResponseEntity<DPrint> saveDPrint(@RequestBody DPrint dPrint) {

        DPrint savedDPrint = dPrintService.saveDPrint(dPrint);

        return new ResponseEntity<>(savedDPrint, HttpStatus.CREATED);
    }

    // Get all D.Print records
    @GetMapping
    public ResponseEntity<List<DPrint>> getAllDPrint() {

        return ResponseEntity.ok(dPrintService.getAllDPrint());
    }

    // Get D.Print record by ID
    @GetMapping("/{id}")
    public ResponseEntity<DPrint> getDPrintById(@PathVariable Long id) {

        Optional<DPrint> dPrint = dPrintService.getDPrintById(id);

        return dPrint.map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    // Delete D.Print record
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteDPrint(@PathVariable Long id) {

        dPrintService.deleteDPrint(id);

        return ResponseEntity.noContent().build();
    }
}
