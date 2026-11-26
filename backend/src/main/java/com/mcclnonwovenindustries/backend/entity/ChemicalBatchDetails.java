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
@Table (name="chemical_batch_details")
public class ChemicalBatchDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "production_date")
    private LocalDate productionDate;

    @Column(name = "shift")
    private String shift;

    @Column(name = "machine_no")
    private String machineNo;

    @Column(name = "hard_binder")
    private BigDecimal hardBinder;

    @Column(name = "soft_binder")
    private BigDecimal softBinder;

    @Column(name = "dolomite")
    private BigDecimal dolomite;

    @Column(name = "china_cly")
    private BigDecimal chinaCly;

    @Column(name = "sls")
    private BigDecimal sls;

    @Column(name = "thick")
    private BigDecimal thick;

    @Column(name = "dsp")
    private BigDecimal dsp;

    @Column(name = "pigment")
    private BigDecimal pigment;

    // Getters and Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getProductionDate() {
        return productionDate;
    }

    public void setProductionDate(LocalDate productionDate) {
        this.productionDate = productionDate;
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

    public BigDecimal getHardBinder() {
        return hardBinder;
    }

    public void setHardBinder(BigDecimal hardBinder) {
        this.hardBinder = hardBinder;
    }

    public BigDecimal getSoftBinder() {
        return softBinder;
    }

    public void setSoftBinder(BigDecimal softBinder) {
        this.softBinder = softBinder;
    }

    public BigDecimal getDolomite() {
        return dolomite;
    }

    public void setDolomite(BigDecimal dolomite) {
        this.dolomite = dolomite;
    }

    public BigDecimal getChinaCly() {
        return chinaCly;
    }

    public void setChinaCly(BigDecimal chinaCly) {
        this.chinaCly = chinaCly;
    }

    public BigDecimal getSls() {
        return sls;
    }

    public void setSls(BigDecimal sls) {
        this.sls = sls;
    }

    public BigDecimal getThick() {
        return thick;
    }

    public void setThick(BigDecimal thick) {
        this.thick = thick;
    }

    public BigDecimal getDsp() {
        return dsp;
    }

    public void setDsp(BigDecimal dsp) {
        this.dsp = dsp;
    }

    public BigDecimal getPigment() {
        return pigment;
    }

    public void setPigment(BigDecimal pigment) {
        this.pigment = pigment;
    }
}
