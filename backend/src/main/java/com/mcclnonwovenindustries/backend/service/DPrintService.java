package com.mcclnonwovenindustries.backend.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.mcclnonwovenindustries.backend.entity.DPrint;
import com.mcclnonwovenindustries.backend.repository.DPrintRepository;

@Service
public class DPrintService {
     private final DPrintRepository dPrintRepository;

    public DPrintService(DPrintRepository dPrintRepository) {
        this.dPrintRepository = dPrintRepository;
    }

    // Save D.Print production data
    public DPrint saveDPrint(DPrint dPrint) {
        return dPrintRepository.save(dPrint);
    }

    // Get all D.Print records
    public List<DPrint> getAllDPrint() {
        return dPrintRepository.findAll();
    }

    // Get D.Print record by ID
    public Optional<DPrint> getDPrintById(Long id) {
        return dPrintRepository.findById(id);
    }

    // Delete D.Print record
    public void deleteDPrint(Long id) {
        dPrintRepository.deleteById(id);
    }
}
