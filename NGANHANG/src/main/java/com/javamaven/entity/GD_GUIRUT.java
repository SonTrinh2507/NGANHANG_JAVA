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
public class GD_GUIRUT {
    private int MAGD;
    private String SOTK;
    private String LOAIGD;
    private Date NGAYGD;
    private long SOTIEN;
    private String MANV;

    public int getMAGD() {
        return MAGD;
    }

    public void setMAGD(int MAGD) {
        this.MAGD = MAGD;
    }

    public String getSOTK() {
        return SOTK;
    }

    public void setSOTK(String SOTK) {
        this.SOTK = SOTK;
    }

    public String getLOAIGD() {
        return LOAIGD;
    }

    public void setLOAIGD(String LOAIGD) {
        this.LOAIGD = LOAIGD;
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

    public String getMANV() {
        return MANV;
    }

    public void setMANV(String MANV) {
        this.MANV = MANV;
    }

    public GD_GUIRUT(int MAGD, String SOTK, String LOAIGD, Date NGAYGD, long SOTIEN, String MANV) {
        this.MAGD = MAGD;
        this.SOTK = SOTK;
        this.LOAIGD = LOAIGD;
        this.NGAYGD = NGAYGD;
        this.SOTIEN = SOTIEN;
        this.MANV = MANV;
    }

    public GD_GUIRUT() {
    }
    
    
}
