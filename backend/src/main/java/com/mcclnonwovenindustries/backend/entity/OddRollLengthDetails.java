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
@Table (name = "odd_roll_length_details")
public class OddRollLengthDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "production_date")
    private LocalDate date;

    private String shift;

    @Column(name = "roll_mtr")
    private BigDecimal rollMtr;

    @Column(name = "total_wt")
    private BigDecimal totalWt;

    public OddRollLengthDetails() {
    }

    public OddRollLengthDetails(LocalDate date, String shift,
                                BigDecimal rollMtr, BigDecimal totalWt) {
        this.date = date;
        this.shift = shift;
        this.rollMtr = rollMtr;
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

    public BigDecimal getRollMtr() {
        return rollMtr;
    }

    public void setRollMtr(BigDecimal rollMtr) {
        this.rollMtr = rollMtr;
    }

    public BigDecimal getTotalWt() {
        return totalWt;
    }

    public void setTotalWt(BigDecimal totalWt) {
        this.totalWt = totalWt;
    }
}
