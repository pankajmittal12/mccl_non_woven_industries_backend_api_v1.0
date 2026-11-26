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
@Table(name = "card_production")
public class CardsDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String shift;

    @Column(name = "machine_no", nullable = false)
    private String machineNo;

    @Column(nullable = false)
    private String product;

    @Column(precision = 10, scale = 2)
    private String shade;

    @Column(precision = 10, scale = 2)
    private BigDecimal gsm;

    @Column(precision = 10, scale = 2)
    private BigDecimal width;

    @Column(name = "rmtr", precision = 12, scale = 2)
    private BigDecimal rmtr;

    @Column(name = "roll_qty")
    private Integer rollQty;

    @Column(name = "total_roll_qty")
    private Integer totalRollQty;

    @Column(name = "production_date", nullable = false)
    private LocalDate productionDate;

    public Long getId() {
        return id;
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

    public LocalDate getProductionDate() {
        return productionDate;
    }

    public void setProductionDate(LocalDate productionDate) {
        this.productionDate = productionDate;
    }
}
