package com.mcclnonwovenindustries.backend.entity;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;

@Entity
@Table(name = "fibers")
public class Fiber {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String shift;

    private String machine;

    private String shade;

    private String lxdn;

    private String fiber;

    private BigDecimal fiberKg;

    private String lv40Kg;

    private BigDecimal silvanaKg;

    private LocalDate productionDate;

    private String total;

    public Fiber() {
    }

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

    public String getMachine() {
        return machine;
    }

    public void setMachine(String machine) {
        this.machine = machine;
    }

    public String getShade() {
        return shade;
    }

    public void setShade(String shade) {
        this.shade = shade;
    }

    public String getLxdn() {
        return lxdn;
    }

    public void setLxdn(String lxdn) {
        this.lxdn = lxdn;
    }

    public String getFiber() {
        return fiber;
    }

    public void setFiber(String fiber) {
        this.fiber = fiber;
    }

    public BigDecimal getFiberKg() {
        return fiberKg;
    }

    public void setFiberKg(BigDecimal fiberKg) {
        this.fiberKg = fiberKg;
    }

    public String getLv40Kg() {
        return lv40Kg;
    }

    public void setLv40Kg(String lv40Kg) {
        this.lv40Kg = lv40Kg;
    }

    public BigDecimal getSilvanaKg() {
        return silvanaKg;
    }

    public void setSilvanaKg(BigDecimal silvanaKg) {
        this.silvanaKg = silvanaKg;
    }

    public LocalDate getProductionDate() {
        return productionDate;
    }

    public void setProductionDate(LocalDate productionDate) {
        this.productionDate = productionDate;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

}
