/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.javamaven.function;

/**
 *
 * @author admin
 */
public class getInfo {
    private String CMND;
    private String HOTEN;
    private long SODU;

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

    public long getSODU() {
        return SODU;
    }

    public void setSODU(long SODU) {
        this.SODU = SODU;
    }

    public getInfo(String CMND, String HOTEN, long SODU) {
        this.CMND = CMND;
        this.HOTEN = HOTEN;
        this.SODU = SODU;
    }
    
    
}
