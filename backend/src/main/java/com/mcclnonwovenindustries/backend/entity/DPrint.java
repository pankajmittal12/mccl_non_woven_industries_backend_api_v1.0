package com.mcclnonwovenindustries.backend.entity;

import java.math.BigDecimal;
import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "D_print")
public class DPrint {

     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "production_date")
    private LocalDate productionDate;

    @Column(name = "shift")
    private String shift;

    @Column(name = "ms_no")
    private String msNo;

    private String product;

    @JsonProperty("dNo")
    @Column(name = "d_no")
    private String dNo;

    private BigDecimal gsm;

    private BigDecimal width;

    private BigDecimal rmtr;

    private Integer rollQty;

    private Integer totalRollQty;

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

    public String getMsNo() {
        return msNo;
    }

    public void setMsNo(String msNo) {
        this.msNo = msNo;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getDNo() {
        return dNo;
    }

    public void setDNo(String dNo) {
        this.dNo = dNo;
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

    public Integer getRollQty() {
        return rollQty;
    }

    public void setRollQty(Integer rollQty) {
        this.rollQty = rollQty;
    }

    public Integer getTotalRollQty() {
        return totalRollQty;
    }

    public void setTotalRollQty(Integer totalRollQty) {
        this.totalRollQty = totalRollQty;
    }

}
