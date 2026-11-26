package com.mcclnonwovenindustries.backend.entity;

import java.math.BigDecimal;
import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "cushion_sheet_production_chemical_details")
public class CushionSheetProductionChemicalDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "production_date")
    private LocalDate date;

    private BigDecimal pvcResin;

    private BigDecimal calciumCarbonate;

    @Column(name = "drop_chemical")
    private BigDecimal drop;

    private BigDecimal cpw;

    private BigDecimal eProxy;

    private BigDecimal stabilizer;

    private BigDecimal sAcid;

    private BigDecimal pvcPasteGrade;

    private BigDecimal d80;

    private BigDecimal finawaxC;

    private BigDecimal redOxide445;

    private BigDecimal yellowOxide445;

    private BigDecimal green2730K;

    private BigDecimal lcy507;

    private BigDecimal yellow165;

    private BigDecimal redRubbine635;

    private BigDecimal middleChrome1322;

    private BigDecimal scarletChrome;

    private BigDecimal red;

    private BigDecimal titaniumDioxide;

    private BigDecimal blue;

    private BigDecimal carbonIndoBlack;

    private BigDecimal neelPowder;

    // Editable title and quantity
    @Column(name = "mto_oil_title")
    private String mtoOilTitle = "MTO Oil";

    private BigDecimal mtoOil;

    private BigDecimal scrap;

    private BigDecimal totalKgs;

    public CushionSheetProductionChemicalDetails() {
    }

    public Long getId() {
        return id;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BigDecimal getPvcResin() {
        return pvcResin;
    }

    public void setPvcResin(BigDecimal pvcResin) {
        this.pvcResin = pvcResin;
    }

    public BigDecimal getCalciumCarbonate() {
        return calciumCarbonate;
    }

    public void setCalciumCarbonate(BigDecimal calciumCarbonate) {
        this.calciumCarbonate = calciumCarbonate;
    }

    public BigDecimal getDrop() {
        return drop;
    }

    public void setDrop(BigDecimal drop) {
        this.drop = drop;
    }

    public BigDecimal getCpw() {
        return cpw;
    }

    public void setCpw(BigDecimal cpw) {
        this.cpw = cpw;
    }

    public BigDecimal geteProxy() {
        return eProxy;
    }

    public void seteProxy(BigDecimal eProxy) {
        this.eProxy = eProxy;
    }

    public BigDecimal getStabilizer() {
        return stabilizer;
    }

    public void setStabilizer(BigDecimal stabilizer) {
        this.stabilizer = stabilizer;
    }

    public BigDecimal getsAcid() {
        return sAcid;
    }

    public void setsAcid(BigDecimal sAcid) {
        this.sAcid = sAcid;
    }

    public BigDecimal getPvcPasteGrade() {
        return pvcPasteGrade;
    }

    public void setPvcPasteGrade(BigDecimal pvcPasteGrade) {
        this.pvcPasteGrade = pvcPasteGrade;
    }

    public BigDecimal getD80() {
        return d80;
    }

    public void setD80(BigDecimal d80) {
        this.d80 = d80;
    }

    public BigDecimal getFinawaxC() {
        return finawaxC;
    }

    public void setFinawaxC(BigDecimal finawaxC) {
        this.finawaxC = finawaxC;
    }

    public BigDecimal getRedOxide445() {
        return redOxide445;
    }

    public void setRedOxide445(BigDecimal redOxide445) {
        this.redOxide445 = redOxide445;
    }

    public BigDecimal getYellowOxide445() {
        return yellowOxide445;
    }

    public void setYellowOxide445(BigDecimal yellowOxide445) {
        this.yellowOxide445 = yellowOxide445;
    }

    public BigDecimal getGreen2730K() {
        return green2730K;
    }

    public void setGreen2730K(BigDecimal green2730K) {
        this.green2730K = green2730K;
    }

    public BigDecimal getLcy507() {
        return lcy507;
    }

    public void setLcy507(BigDecimal lcy507) {
        this.lcy507 = lcy507;
    }

    public BigDecimal getYellow165() {
        return yellow165;
    }

    public void setYellow165(BigDecimal yellow165) {
        this.yellow165 = yellow165;
    }

    public BigDecimal getRedRubbine635() {
        return redRubbine635;
    }

    public void setRedRubbine635(BigDecimal redRubbine635) {
        this.redRubbine635 = redRubbine635;
    }

    public BigDecimal getMiddleChrome1322() {
        return middleChrome1322;
    }

    public void setMiddleChrome1322(BigDecimal middleChrome1322) {
        this.middleChrome1322 = middleChrome1322;
    }

    public BigDecimal getScarletChrome() {
        return scarletChrome;
    }

    public void setScarletChrome(BigDecimal scarletChrome) {
        this.scarletChrome = scarletChrome;
    }

    public BigDecimal getRed() {
        return red;
    }

    public void setRed(BigDecimal red) {
        this.red = red;
    }

    public BigDecimal getTitaniumDioxide() {
        return titaniumDioxide;
    }

    public void setTitaniumDioxide(BigDecimal titaniumDioxide) {
        this.titaniumDioxide = titaniumDioxide;
    }

    public BigDecimal getBlue() {
        return blue;
    }

    public void setBlue(BigDecimal blue) {
        this.blue = blue;
    }

    public BigDecimal getCarbonIndoBlack() {
        return carbonIndoBlack;
    }

    public void setCarbonIndoBlack(BigDecimal carbonIndoBlack) {
        this.carbonIndoBlack = carbonIndoBlack;
    }

    public BigDecimal getNeelPowder() {
        return neelPowder;
    }

    public void setNeelPowder(BigDecimal neelPowder) {
        this.neelPowder = neelPowder;
    }

    public String getMtoOilTitle() {
        return mtoOilTitle;
    }

    public void setMtoOilTitle(String mtoOilTitle) {
        this.mtoOilTitle = mtoOilTitle;
    }

    public BigDecimal getMtoOil() {
        return mtoOil;
    }

    public void setMtoOil(BigDecimal mtoOil) {
        this.mtoOil = mtoOil;
    }

    public BigDecimal getScrap() {
        return scrap;
    }

    public void setScrap(BigDecimal scrap) {
        this.scrap = scrap;
    }

    public BigDecimal getTotalKgs() {
        return totalKgs;
    }

    public void setTotalKgs(BigDecimal totalKgs) {
        this.totalKgs = totalKgs;
    }

}
