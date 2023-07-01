/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.javamaven.entity;

/**
 *
 * @author admin
 */
public class CHINHANH {
    private String MACN;
    private String TENCN;
    private String DIACHI;
    private String SoDT;

    public String getMACN() {
        return MACN;
    }

    public void setMACN(String MACN) {
        this.MACN = MACN;
    }

    public String getTENCN() {
        return TENCN;
    }

    public void setTENCN(String TENCN) {
        this.TENCN = TENCN;
    }

    public String getDIACHI() {
        return DIACHI;
    }

    public void setDIACHI(String DIACHI) {
        this.DIACHI = DIACHI;
    }

    public String getSoDT() {
        return SoDT;
    }

    public void setSoDT(String SoDT) {
        this.SoDT = SoDT;
    }

    public CHINHANH(String MACN, String TENCN, String DIACHI, String SoDT) {
        this.MACN = MACN;
        this.TENCN = TENCN;
        this.DIACHI = DIACHI;
        this.SoDT = SoDT;
    }

    public CHINHANH() {
    }
    
    
}
