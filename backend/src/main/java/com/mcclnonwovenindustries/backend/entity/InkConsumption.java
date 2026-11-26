package com.mcclnonwovenindustries.backend.entity;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity 
@Table (name = "ink_consumption")
public class InkConsumption {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "shift")
    private String shift;

    @Column(name = "black")
    private String black;

    @Column(name = "yellow")
    private String yellow;

    @Column(name = "magenta")
    private String magenta;

    @Column(name = "cyan")
    private String cyan;

    @Column(name = "total_kg")
    private BigDecimal totalKg;

    // Getters and Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getShift() {
        return shift;
    }

    public void setShift(String shift) {
        this.shift = shift;
    }

    public String getBlack() {
        return black;
    }

    public void setBlack(String black) {
        this.black = black;
    }

    public String getYellow() {
        return yellow;
    }

    public void setYellow(String yellow) {
        this.yellow = yellow;
    }

    public String getMagenta() {
        return magenta;
    }

    public void setMagenta(String magenta) {
        this.magenta = magenta;
    }

    public String getCyan() {
        return cyan;
    }

    public void setCyan(String cyan) {
        this.cyan = cyan;
    }

    public BigDecimal getTotalKg() {
        return totalKg;
    }

    public void setTotalKg(BigDecimal totalKg) {
        this.totalKg = totalKg;
    }
}
