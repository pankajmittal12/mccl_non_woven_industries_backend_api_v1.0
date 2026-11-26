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
@Table (name = "cushion_sheet_production_details")
public class CushionSheetProductionDetails {
    
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

    private BigDecimal gsm;

    private BigDecimal width;

    private BigDecimal rmtr;

    @Column(name = "roll_qty")
    private BigDecimal rollQty;

    private BigDecimal wt;

    public CushionSheetProductionDetails() {
    }

    public CushionSheetProductionDetails(
            LocalDate date,
            String shift,
            String machineNo,
            String product,
            String shade,
            BigDecimal gsm,
            BigDecimal width,
            BigDecimal rmtr,
            BigDecimal rollQty,
            BigDecimal wt) {

        this.date = date;
        this.shift = shift;
        this.machineNo = machineNo;
        this.product = product;
        this.shade = shade;
        this.gsm = gsm;
        this.width = width;
        this.rmtr = rmtr;
        this.rollQty = rollQty;
        this.wt = wt;
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

    public BigDecimal getGsm() {
        return gsm;
    }

    public void setGsm(BigDecimal gsm) {
        this.gsm = gsm;
    }

    public BigDecimal getWidth() {
        return width;
    }

    public void setWidth(BigDecimal width) {
        this.width = width;
    }

    public BigDecimal getRmtr() {
        return rmtr;
    }

    public void setRmtr(BigDecimal rmtr) {
        this.rmtr = rmtr;
    }

    public BigDecimal getRollQty() {
        return rollQty;
    }

    public void setRollQty(BigDecimal rollQty) {
        this.rollQty = rollQty;
    }

    public BigDecimal getWt() {
        return wt;
    }

    public void setWt(BigDecimal wt) {
        this.wt = wt;
    }
    
}
