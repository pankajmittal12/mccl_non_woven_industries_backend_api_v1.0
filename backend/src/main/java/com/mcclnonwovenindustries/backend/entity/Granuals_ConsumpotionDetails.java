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
@Table (name = "granuals_consumption_details")
public class Granuals_ConsumpotionDetails {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "production_date")
    private LocalDate date;

    @Column(name = "granual_title")
    private String granualTitle = "Granual (Kgs.)";

    @Column(name = "granual")
    private BigDecimal granual;

    private BigDecimal lldpe;

    private BigDecimal pp;

    private BigDecimal hdpe;

    private BigDecimal ppa;

    private BigDecimal ub;

    private BigDecimal ob;

    private BigDecimal mb;

    private BigDecimal total;

    private BigDecimal scrap;

    public Granuals_ConsumpotionDetails() {
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

    public String getGranualTitle() {
        return granualTitle;
    }

    public void setGranualTitle(String granualTitle) {
        this.granualTitle = granualTitle;
    }

    public BigDecimal getGranual() {
        return granual;
    }

    public void setGranual(BigDecimal granual) {
        this.granual = granual;
    }

    public BigDecimal getLldpe() {
        return lldpe;
    }

    public void setLldpe(BigDecimal lldpe) {
        this.lldpe = lldpe;
    }

    public BigDecimal getPp() {
        return pp;
    }

    public void setPp(BigDecimal pp) {
        this.pp = pp;
    }

    public BigDecimal getHdpe() {
        return hdpe;
    }

    public void setHdpe(BigDecimal hdpe) {
        this.hdpe = hdpe;
    }

    public BigDecimal getPpa() {
        return ppa;
    }

    public void setPpa(BigDecimal ppa) {
        this.ppa = ppa;
    }

    public BigDecimal getUb() {
        return ub;
    }

    public void setUb(BigDecimal ub) {
        this.ub = ub;
    }

    public BigDecimal getOb() {
        return ob;
    }

    public void setOb(BigDecimal ob) {
        this.ob = ob;
    }

    public BigDecimal getMb() {
        return mb;
    }

    public void setMb(BigDecimal mb) {
        this.mb = mb;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public BigDecimal getScrap() {
        return scrap;
    }

    public void setScrap(BigDecimal scrap) {
        this.scrap = scrap;
    }
}
