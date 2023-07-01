/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.javamaven.entity;

import java.sql.Date;

/**
 *
 * @author admin
 */
public class TAIKHOAN {
    private String SOTK;
    private String CMND;
    private long SODU;
    private String MACN;
    private Date NGAYMOTK;

    public String getSOTK() {
        return SOTK;
    }

    public void setSOTK(String SOTK) {
        this.SOTK = SOTK;
    }

    public String getCMND() {
        return CMND;
    }

    public void setCMND(String CMND) {
        this.CMND = CMND;
    }

    public long getSODU() {
        return SODU;
    }

    public void setSODU(long SODU) {
        this.SODU = SODU;
    }

    public String getMACN() {
        return MACN;
    }

    public void setMACN(String MACN) {
        this.MACN = MACN;
    }

    public Date getNGAYMOTK() {
        return NGAYMOTK;
    }

    public void setNGAYMOTK(Date NGAYMOTK) {
        this.NGAYMOTK = NGAYMOTK;
    }
    
    public TAIKHOAN(String SOTK, String CMND, long SODU, String MACN, Date NGAYMOTK) {
        this.SOTK = SOTK;
        this.CMND = CMND;
        this.SODU = SODU;
        this.MACN = MACN;
        this.NGAYMOTK = NGAYMOTK;
    }

    public TAIKHOAN() {
    }
    
    
    
    
}
