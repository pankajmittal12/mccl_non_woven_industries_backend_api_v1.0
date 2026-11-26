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
@Table (name = "artificial_yarn_consumption")
public class ArtificialYarnConsumption {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "production_date")
    private LocalDate date;

    @Column(name = "shift")
    private String shift;

    @Column(name = "machine_no")
    private String machineNo;

    @Column(name = "product")
    private String product;

    @Column(name = "shade")
    private String shade;

    @Column(name = "dtex")
    private BigDecimal dtex;

    @Column(name = "yarn_kg")
    private BigDecimal yarnKg;

    public ArtificialYarnConsumption() {
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

    public BigDecimal getYarnKg() {
        return yarnKg;
    }

    public void setYarnKg(BigDecimal yarnKg) {
        this.yarnKg = yarnKg;
    }
}
