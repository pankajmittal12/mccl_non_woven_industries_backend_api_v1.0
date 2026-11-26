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

import com.mcclnonwovenindustries.backend.entity.Fiber;
import com.mcclnonwovenindustries.backend.service.FiberService;

@RestController
@RequestMapping("/api/fibers")
public class FiberController {
    private final FiberService fiberService;

    public FiberController(FiberService fiberService) {
        this.fiberService = fiberService;
    }

    // CREATE FIBER
    @PostMapping
    public ResponseEntity<Fiber> createFiber(@RequestBody Fiber fiber) {

        Fiber savedFiber = fiberService.saveFiber(fiber);

        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(savedFiber);
    }

    // GET ALL FIBERS
    @GetMapping
    public ResponseEntity<List<Fiber>> getAllFibers() {

        return ResponseEntity.ok(
                fiberService.getAllFibers()
        );
    }

    // GET FIBER BY ID
    @GetMapping("/{id}")
    public ResponseEntity<Fiber> getFiberById(@PathVariable Long id) {

        return fiberService.getFiberById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    // UPDATE FIBER
    @PutMapping("/{id}")
    public ResponseEntity<Fiber> updateFiber(
            @PathVariable Long id,
            @RequestBody Fiber fiber) {

        try {
            Fiber updatedFiber = fiberService.updateFiber(id, fiber);
            return ResponseEntity.ok(updatedFiber);

        } catch (RuntimeException exception) {
            return ResponseEntity.notFound().build();
        }
    }

    // DELETE FIBER
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteFiber(@PathVariable Long id) {

        try {
            fiberService.deleteFiber(id);
            return ResponseEntity.noContent().build();

        } catch (RuntimeException exception) {
            return ResponseEntity.notFound().build();
        }
    }
}
