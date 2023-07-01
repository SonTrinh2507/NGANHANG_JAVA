/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.javamaven.entity;

import java.util.Date;



/**
 *
 * @author admin
 */
public class GD_CHUYENTIEN {
    private int MAGD;
    private String SOTK_CHUYEN;
    private Date NGAYGD;
    private long SOTIEN;
    private String SOTK_NHAN;
    private String MANV;

    public int getMAGD() {
        return MAGD;
    }

    public void setMAGD(int MAGD) {
        this.MAGD = MAGD;
    }

    public String getSOTK_CHUYEN() {
        return SOTK_CHUYEN;
    }

    public void setSOTK_CHUYEN(String SOTK_CHUYEN) {
        this.SOTK_CHUYEN = SOTK_CHUYEN;
    }

    public Date getNGAYGD() {
        return NGAYGD;
    }

    public void setNGAYGD(Date NGAYGD) {
        this.NGAYGD = NGAYGD;
    }

    public long getSOTIEN() {
        return SOTIEN;
    }

    public void setSOTIEN(long SOTIEN) {
        this.SOTIEN = SOTIEN;
    }

    public String getSOTK_NHAN() {
        return SOTK_NHAN;
    }

    public void setSOTK_NHAN(String SOTK_NHAN) {
        this.SOTK_NHAN = SOTK_NHAN;
    }

    public String getMANV() {
        return MANV;
    }

    public void setMANV(String MANV) {
        this.MANV = MANV;
    }

    public GD_CHUYENTIEN(int MAGD, String SOTK_CHUYEN, Date NGAYGD, long SOTIEN, String SOTK_NHAN, String MANV) {
        this.MAGD = MAGD;
        this.SOTK_CHUYEN = SOTK_CHUYEN;
        this.NGAYGD = NGAYGD;
        this.SOTIEN = SOTIEN;
        this.SOTK_NHAN = SOTK_NHAN;
        this.MANV = MANV;
    }

    public GD_CHUYENTIEN() {
    }
    
    
    
}
