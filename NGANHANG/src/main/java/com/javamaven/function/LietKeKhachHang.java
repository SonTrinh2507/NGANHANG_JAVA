/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.javamaven.function;

import java.util.Date;

/**
 *
 * @author admin
 */
public class LietKeKhachHang {
    private String CMND;
    private String HOTEN;
    private String DIACHI;
    private String PHAI;
    private Date NGAYCAP;
    private String SODT;

    public String getCMND() {
        return CMND;
    }

    public void setCMND(String CMND) {
        this.CMND = CMND;
    }

    public String getHOTEN() {
        return HOTEN;
    }

    public void setHOTEN(String HOTEN) {
        this.HOTEN = HOTEN;
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

    public LietKeKhachHang(String CMND, String HOTEN, String DIACHI, String PHAI, Date NGAYCAP, String SODT) {
        this.CMND = CMND;
        this.HOTEN = HOTEN;
        this.DIACHI = DIACHI;
        this.PHAI = PHAI;
        this.NGAYCAP = NGAYCAP;
        this.SODT = SODT;
    }

    public LietKeKhachHang() {
    }
    
    
    
}
