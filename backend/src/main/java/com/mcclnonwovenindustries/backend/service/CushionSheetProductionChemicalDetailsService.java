package com.mcclnonwovenindustries.backend.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mcclnonwovenindustries.backend.entity.CushionSheetProductionChemicalDetails;
import com.mcclnonwovenindustries.backend.repository.CushionSheetProductionChemicalDetailsRepository;

@Service 
public class CushionSheetProductionChemicalDetailsService {
     private final CushionSheetProductionChemicalDetailsRepository repository;

    public CushionSheetProductionChemicalDetailsService(
            CushionSheetProductionChemicalDetailsRepository repository) {
        this.repository = repository;
    }

    // Save Details
    public CushionSheetProductionChemicalDetails saveDetails(
            CushionSheetProductionChemicalDetails details) {
        return repository.save(details);
    }

    // Get All Details
    public List<CushionSheetProductionChemicalDetails> getAllDetails() {
        return repository.findAll();
    }

    // Get Details By ID
    public CushionSheetProductionChemicalDetails getDetailsById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException(
                        "Details not found with id: " + id));
    }

    // Update Details
    public CushionSheetProductionChemicalDetails updateDetails(
            Long id,
            CushionSheetProductionChemicalDetails updatedDetails) {

        CushionSheetProductionChemicalDetails existingDetails =
                getDetailsById(id);

        existingDetails.setDate(updatedDetails.getDate());
        existingDetails.setPvcResin(updatedDetails.getPvcResin());
        existingDetails.setCalciumCarbonate(updatedDetails.getCalciumCarbonate());
        existingDetails.setDrop(updatedDetails.getDrop());
        existingDetails.setCpw(updatedDetails.getCpw());
        existingDetails.seteProxy(updatedDetails.geteProxy());
        existingDetails.setStabilizer(updatedDetails.getStabilizer());
        existingDetails.setsAcid(updatedDetails.getsAcid());
        existingDetails.setPvcPasteGrade(updatedDetails.getPvcPasteGrade());
        existingDetails.setD80(updatedDetails.getD80());
        existingDetails.setFinawaxC(updatedDetails.getFinawaxC());
        existingDetails.setRedOxide445(updatedDetails.getRedOxide445());
        existingDetails.setYellowOxide445(updatedDetails.getYellowOxide445());
        existingDetails.setGreen2730K(updatedDetails.getGreen2730K());
        existingDetails.setLcy507(updatedDetails.getLcy507());
        existingDetails.setYellow165(updatedDetails.getYellow165());
        existingDetails.setRedRubbine635(updatedDetails.getRedRubbine635());
        existingDetails.setMiddleChrome1322(updatedDetails.getMiddleChrome1322());
        existingDetails.setScarletChrome(updatedDetails.getScarletChrome());
        existingDetails.setRed(updatedDetails.getRed());
        existingDetails.setTitaniumDioxide(updatedDetails.getTitaniumDioxide());
        existingDetails.setBlue(updatedDetails.getBlue());
        existingDetails.setCarbonIndoBlack(updatedDetails.getCarbonIndoBlack());
        existingDetails.setNeelPowder(updatedDetails.getNeelPowder());

        // Editable MTO Oil title and quantity
        existingDetails.setMtoOilTitle(updatedDetails.getMtoOilTitle());
        existingDetails.setMtoOil(updatedDetails.getMtoOil());

        existingDetails.setScrap(updatedDetails.getScrap());
        existingDetails.setTotalKgs(updatedDetails.getTotalKgs());

        return repository.save(existingDetails);
    }

    // Delete Details
    public void deleteDetails(Long id) {
        CushionSheetProductionChemicalDetails existingDetails =
                getDetailsById(id);

        repository.delete(existingDetails);
    }
}
