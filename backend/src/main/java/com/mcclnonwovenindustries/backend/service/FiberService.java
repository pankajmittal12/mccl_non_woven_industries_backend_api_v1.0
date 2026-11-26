package com.mcclnonwovenindustries.backend.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.mcclnonwovenindustries.backend.entity.Fiber;
import com.mcclnonwovenindustries.backend.repository.FiberRepository;

@Service 
public class FiberService {
    private final FiberRepository fiberRepository;

    public FiberService(FiberRepository fiberRepository) {
        this.fiberRepository = fiberRepository;
    }

    // Save Fiber
    public Fiber saveFiber(Fiber fiber) {
        return fiberRepository.save(fiber);
    }

    // Get All Fibers
    public List<Fiber> getAllFibers() {
        return fiberRepository.findAll();
    }

    // Get Fiber By ID
    public Optional<Fiber> getFiberById(Long id) {
        return fiberRepository.findById(id);
    }

    // Update Fiber
    public Fiber updateFiber(Long id, Fiber updatedFiber) {

        Fiber existingFiber = fiberRepository.findById(id)
                .orElseThrow(() ->
                        new RuntimeException("Fiber not found with ID: " + id));

        existingFiber.setShift(updatedFiber.getShift());
        existingFiber.setMachine(updatedFiber.getMachine());
        existingFiber.setShade(updatedFiber.getShade());
        existingFiber.setLxdn(updatedFiber.getLxdn());
        existingFiber.setFiber(updatedFiber.getFiber());
        existingFiber.setFiberKg(updatedFiber.getFiberKg());
        existingFiber.setLv40Kg(updatedFiber.getLv40Kg());
        existingFiber.setSilvanaKg(updatedFiber.getSilvanaKg());
        existingFiber.setTotal(updatedFiber.getTotal());
        existingFiber.setProductionDate(updatedFiber.getProductionDate());

        return fiberRepository.save(existingFiber);
    }

    // Delete Fiber
    public void deleteFiber(Long id) {

        Fiber existingFiber = fiberRepository.findById(id)
                .orElseThrow(() ->
                        new RuntimeException("Fiber not found with ID: " + id));

        fiberRepository.delete(existingFiber);
    }
}
