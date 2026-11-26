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
@Table (name = "sheet_scrap_details")
public class SheetScrapDetails {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "production_date")
    private LocalDate date;

    private String shift;

    @Column(name = "total_wt")
    private BigDecimal totalWt;

    public SheetScrapDetails() {
    }

    public SheetScrapDetails(
            LocalDate date,
            String shift,
            BigDecimal totalWt) {
        this.date = date;
        this.shift = shift;
        this.totalWt = totalWt;
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

    public BigDecimal getTotalWt() {
        return totalWt;
    }

    public void setTotalWt(BigDecimal totalWt) {
        this.totalWt = totalWt;
    }
    
}
