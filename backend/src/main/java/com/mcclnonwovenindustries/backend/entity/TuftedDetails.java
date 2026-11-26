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
@Table (name = "tufted_Details")
public class TuftedDetails {
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

    @Column(name = "y_gsm")
    private BigDecimal yGsm;

    @Column(name = "width")
    private BigDecimal width;

    @Column(name = "t_mtr")
    private BigDecimal tMtr;

    @Column(name = "t_qty")
    private String tQty;

    @Column(name = "total_t_qty")
    private Integer totalTQty;


    // Getters and Setters

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

    public BigDecimal getYGsm() {
        return yGsm;
    }

    public void setYGsm(BigDecimal yGsm) {
        this.yGsm = yGsm;
    }

    public BigDecimal getWidth() {
        return width;
    }

    public void setWidth(BigDecimal width) {
        this.width = width;
    }

    public BigDecimal getTMtr() {
        return tMtr;
    }

    public void setTMtr(BigDecimal tMtr) {
        this.tMtr = tMtr;
    }

    public String getTQty() {
        return tQty;
    }

    public void setTQty(String tQty) {
        this.tQty = tQty;
    }

    public Integer getTotalTQty() {
        return totalTQty;
    }

    public void setTotalTQty(Integer totalTQty) {
        this.totalTQty = totalTQty;
    }
}
