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
@Table (name = "stenter_details")
public class StenterDetails {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "production_date")
    private LocalDate productionDate;

    @Column(name = "shift")
    private String shift;

    @Column(name = "machine_no")
    private String machineNo;

    @Column(name = "product")
    private String product;

    @Column(name = "shade_d_no")
    private String shadeDNo;

    @Column(name = "width")
    private BigDecimal width;

    @Column(name = "roll_qty")
    private Integer rollQty;

    @Column(name = "rmtr")
    private BigDecimal rmtr;

    @Column(name = "total_rmtr")
    private String totalRmtr;

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

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getShadeDNo() {
        return shadeDNo;
    }

    public void setShadeDNo(String shadeDNo) {
        this.shadeDNo = shadeDNo;
    }

    public BigDecimal getWidth() {
        return width;
    }

    public void setWidth(BigDecimal width) {
        this.width = width;
    }

    public Integer getRollQty() {
        return rollQty;
    }

    public void setRollQty(Integer rollQty) {
        this.rollQty = rollQty;
    }

    public BigDecimal getRmtr() {
        return rmtr;
    }

    public void setRmtr(BigDecimal rmtr) {
        this.rmtr = rmtr;
    }

    public String getTotalRmtr() {
        return totalRmtr;
    }

    public void setTotalRmtr(String totalRmtr) {
        this.totalRmtr = totalRmtr;
    }

}
