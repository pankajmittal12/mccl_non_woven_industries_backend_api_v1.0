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
@Table (name = "m_color_consumption_details")
public class M_colorConsumptionDetails {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "production_date")
    private LocalDate date;

    @Column(name = "m_color_title")
    private String mColorTitle = "M.Color (Kgs.)";

    @Column(name = "m_color")
    private BigDecimal mColor;

    @Column(name = "m_grey")
    private BigDecimal mGrey;

    @Column(name = "m_black")
    private BigDecimal mBlack;

    @Column(name = "m_yellow")
    private BigDecimal mYellow;

    @Column(name = "m_white")
    private BigDecimal mWhite;

    @Column(name = "m_orange")
    private BigDecimal mOrange;

    @Column(name = "m_browan")
    private BigDecimal mBrowan;

    @Column(name = "m_natural")
    private BigDecimal mNatural;

    @Column(name = "m_lightgreen")
    private BigDecimal mLightgreen;

    @Column(name = "m_darkgreen")
    private BigDecimal mDarkgreen;

    @Column(name = "m_blue")
    private BigDecimal mBlue;

    @Column(name = "m_red")
    private BigDecimal mRed;

    @Column(name = "total")
    private BigDecimal total;

    public M_colorConsumptionDetails() {
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

    public String getMColorTitle() {
        return mColorTitle;
    }

    public void setMColorTitle(String mColorTitle) {
        this.mColorTitle = mColorTitle;
    }

    public BigDecimal getMColor() {
        return mColor;
    }

    public void setMColor(BigDecimal mColor) {
        this.mColor = mColor;
    }

    public BigDecimal getMGrey() {
        return mGrey;
    }

    public void setMGrey(BigDecimal mGrey) {
        this.mGrey = mGrey;
    }

    public BigDecimal getMBlack() {
        return mBlack;
    }

    public void setMBlack(BigDecimal mBlack) {
        this.mBlack = mBlack;
    }

    public BigDecimal getMYellow() {
        return mYellow;
    }

    public void setMYellow(BigDecimal mYellow) {
        this.mYellow = mYellow;
    }

    public BigDecimal getMWhite() {
        return mWhite;
    }

    public void setMWhite(BigDecimal mWhite) {
        this.mWhite = mWhite;
    }

    public BigDecimal getMOrange() {
        return mOrange;
    }

    public void setMOrange(BigDecimal mOrange) {
        this.mOrange = mOrange;
    }

    public BigDecimal getMBrowan() {
        return mBrowan;
    }

    public void setMBrowan(BigDecimal mBrowan) {
        this.mBrowan = mBrowan;
    }

    public BigDecimal getMNatural() {
        return mNatural;
    }

    public void setMNatural(BigDecimal mNatural) {
        this.mNatural = mNatural;
    }

    public BigDecimal getMLightgreen() {
        return mLightgreen;
    }

    public void setMLightgreen(BigDecimal mLightgreen) {
        this.mLightgreen = mLightgreen;
    }

    public BigDecimal getMDarkgreen() {
        return mDarkgreen;
    }

    public void setMDarkgreen(BigDecimal mDarkgreen) {
        this.mDarkgreen = mDarkgreen;
    }

    public BigDecimal getMBlue() {
        return mBlue;
    }

    public void setMBlue(BigDecimal mBlue) {
        this.mBlue = mBlue;
    }

    public BigDecimal getMRed() {
        return mRed;
    }

    public void setMRed(BigDecimal mRed) {
        this.mRed = mRed;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }
}
