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
public class KHACHHANG {
    private String CMND;
    private String HO;
    private String TEN;
    private String DIACHI;
    private String PHAI;
    private Date NGAYCAP;
    private String SODT;
    private String MACN;

    public String getCMND() {
        return CMND;
    }

    public void setCMND(String CMND) {
        this.CMND = CMND;
    }

    public String getHO() {
        return HO;
    }

    public void setHO(String HO) {
        this.HO = HO;
    }

    public String getTEN() {
        return TEN;
    }

    public void setTEN(String TEN) {
        this.TEN = TEN;
    }

    public String getDIACHI() {
        return DIACHI;
    }

    public void setDIACHI(String DIACHI) {
        this.DIACHI = DIACHI;
    }

    public String getPHAI() {
        return PHAI;
    }

    public void setPHAI(String PHAI) {
        this.PHAI = PHAI;
    }

    public Date getNGAYCAP() {
        return NGAYCAP;
    }

    public void setNGAYCAP(Date NGAYCAP) {
        this.NGAYCAP = NGAYCAP;
    }

    public String getSODT() {
        return SODT;
    }

    public void setSODT(String SODT) {
        this.SODT = SODT;
    }

    public String getMACN() {
        return MACN;
    }

    public void setMACN(String MACN) {
        this.MACN = MACN;
    }

    public KHACHHANG(String CMND, String HO, String TEN, String DIACHI, String PHAI, Date NGAYCAP, String SODT, String MACN) {
        this.CMND = CMND;
        this.HO = HO;
        this.TEN = TEN;
        this.DIACHI = DIACHI;
        this.PHAI = PHAI;
        this.NGAYCAP = NGAYCAP;
        this.SODT = SODT;
        this.MACN = MACN;
    }

    public KHACHHANG() {
    }
    
    
}
