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
@Table (name = "cusion_mat_details")
public class CusionMatDetails {

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

    @Column(name = "gsm")
    private BigDecimal gsm;

    @Column(name = "width")
    private String width;

    @Column(name = "rmtr")
    private Integer rmtr;

    @Column(name = "roll_qty")
    private Integer rollQty;

    @Column(name = "wt")
    private BigDecimal wt;

    @Column(name = "total_wt")
    private BigDecimal totalWt;

    public CusionMatDetails() {
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

    public String getWidth() {
        return width;
    }

    public void setWidth(String width) {
        this.width = width;
    }

    public Integer getRmtr() {
        return rmtr;
    }

    public void setRmtr(Integer rmtr) {
        this.rmtr = rmtr;
    }

    public Integer getRollQty() {
        return rollQty;
    }

    public void setRollQty(Integer rollQty) {
        this.rollQty = rollQty;
    }

    public BigDecimal getWt() {
        return wt;
    }

    public void setWt(BigDecimal wt) {
        this.wt = wt;
    }

    public BigDecimal getTotalWt() {
        return totalWt;
    }

    public void setTotalWt(BigDecimal totalWt) {
        this.totalWt = totalWt;
    }
}
