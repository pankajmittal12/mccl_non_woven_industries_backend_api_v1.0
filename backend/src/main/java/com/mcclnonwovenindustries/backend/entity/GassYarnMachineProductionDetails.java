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
@Table (name = "gass_yarn_machine_production_details")
public class GassYarnMachineProductionDetails {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "production_date")
    private LocalDate date;

    private String shift;

    @Column(name = "machine_no")
    private String machineNo;

    private String product;

    private String shade;

    private BigDecimal dtex;

    @Column(name = "bobbin_qty")
    private BigDecimal bobbinQty;

    @Column(name = "g_wt")
    private BigDecimal gWt;

    @Column(name = "n_wt")
    private BigDecimal nWt;

    public GassYarnMachineProductionDetails() {
    }

    public GassYarnMachineProductionDetails(
            LocalDate date,
            String shift,
            String machineNo,
            String product,
            String shade,
            BigDecimal dtex,
            BigDecimal bobbinQty,
            BigDecimal gWt,
            BigDecimal nWt) {

        this.date = date;
        this.shift = shift;
        this.machineNo = machineNo;
        this.product = product;
        this.shade = shade;
        this.dtex = dtex;
        this.bobbinQty = bobbinQty;
        this.gWt = gWt;
        this.nWt = nWt;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getShift() {
        return shift;
    }

    public void setShift(String shift) {
        this.shift = shift;
    }

    public String getMachineNo() {
        return machineNo;
    }

    public void setMachineNo(String machineNo) {
        this.machineNo = machineNo;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getShade() {
        return shade;
    }

    public void setShade(String shade) {
        this.shade = shade;
    }

    public BigDecimal getDtex() {
        return dtex;
    }

    public void setDtex(BigDecimal dtex) {
        this.dtex = dtex;
    }

    public BigDecimal getBobbinQty() {
        return bobbinQty;
    }

    public void setBobbinQty(BigDecimal bobbinQty) {
        this.bobbinQty = bobbinQty;
    }

    public BigDecimal getGWt() {
        return gWt;
    }

    public void setGWt(BigDecimal gWt) {
        this.gWt = gWt;
    }

    public BigDecimal getNWt() {
        return nWt;
    }

    public void setNWt(BigDecimal nWt) {
        this.nWt = nWt;
    }
}
