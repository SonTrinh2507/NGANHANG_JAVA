/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.javamaven.entity;

/**
 *
 * @author admin
 */
public class NHANVIEN {
    private String MANV;
    private String HO;
    private String TEN;
    private String CMND;
    private String DIACHI;
    private String PHAI;
    private String SODT;
    private String MACN;
    private int TrangThaiXoa;

    public String getMANV() {
        return MANV;
    }

    public void setMANV(String MANV) {
        this.MANV = MANV;
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

    public String getCMND() {
        return CMND;
    }

    public void setCMND(String CMND) {
        this.CMND = CMND;
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

    public int getTrangThaiXoa() {
        return TrangThaiXoa;
    }

    public void setTrangThaiXoa(int TrangThaiXoa) {
        this.TrangThaiXoa = TrangThaiXoa;
    }

    public NHANVIEN(String MANV, String HO, String TEN, String CMND, String DIACHI, String PHAI, String SODT, String MACN, int TrangThaiXoa) {
        this.MANV = MANV;
        this.HO = HO;
        this.TEN = TEN;
        this.CMND = CMND;
        this.DIACHI = DIACHI;
        this.PHAI = PHAI;
        this.SODT = SODT;
        this.MACN = MACN;
        this.TrangThaiXoa = TrangThaiXoa;
    }

    

    public NHANVIEN() {
    }
    
    
}
