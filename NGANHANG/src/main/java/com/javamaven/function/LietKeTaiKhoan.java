/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.javamaven.function;

/**
 *
 * @author admin
 */
public class LietKeTaiKhoan {
    private String SOTK;
    private String NGAYMOTK;
    private String MACN;

    public String getSOTK() {
        return SOTK;
    }

    public void setSOTK(String SOTK) {
        this.SOTK = SOTK;
    }

    public String getNGAYMOTK() {
        return NGAYMOTK;
    }

    public void setNGAYMOTK(String NGAYMOTK) {
        this.NGAYMOTK = NGAYMOTK;
    }

    public String getMACN() {
        return MACN;
    }

    public void setMACN(String MACN) {
        this.MACN = MACN;
    }

    public LietKeTaiKhoan(String SOTK, String NGAYMOTK, String MACN) {
        this.SOTK = SOTK;
        this.NGAYMOTK = NGAYMOTK;
        this.MACN = MACN;
    }
    
}
