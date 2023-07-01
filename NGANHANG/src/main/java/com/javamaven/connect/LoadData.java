/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.javamaven.connect;

import com.javamaven.controller.controller;
import com.javamaven.entity.*;
import com.javamaven.function.LietKeKhachHang;
import com.javamaven.function.getInfo;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author admin
 */
public class LoadData {

    public static void loadTableNhanVien() {
        ResultSet rs = DataConnection.retrieveData("select * from dbo.NhanVien WHERE TrangThaiXoa = 0");
        try {
            while (rs.next()) {
                NHANVIEN nv = new NHANVIEN(
                        rs.getString("MANV"),
                        rs.getString("HO"),
                        rs.getString("TEN"),
                        rs.getString("CMND"),
                        rs.getString("DIACHI"),
                        rs.getString("PHAI"),
                        rs.getString("SODT"),
                        rs.getString("MACN"),
                        rs.getInt("TrangThaiXoa"));
                controller.arrayListNhanVien.add(nv);
            }
        } catch (SQLException ex) {
            Logger.getLogger(LoadData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void V_DSPM(String tenLogin) {
        ResultSet rs = DataConnection.retrieveData("EXEC [dbo].[SP_DangNhap] " + tenLogin);
        try {
            while (rs.next()) {
                String Username = rs.getString("USERNAME");
                String HOTEN = rs.getString("HOTEN");
                String TENNHOM = rs.getString("TENNHOM");
                String CHINHANH = rs.getString("MACN");
                DataConnection.mGroup = TENNHOM;
                DataConnection.mUsername = Username;
                DataConnection.mHoten = HOTEN;
                DataConnection.mCN = CHINHANH;
            }
        } catch (SQLException ex) {
            Logger.getLogger(LoadData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void loadTableKhachHang() {
        ResultSet rs = DataConnection.retrieveData("select * from dbo.KhachHang");
        try {
            while (rs.next()) {
                KHACHHANG kh = new KHACHHANG(
                        rs.getString("CMND"),
                        rs.getString("HO"),
                        rs.getString("TEN"),
                        rs.getString("DIACHI"),
                        rs.getString("PHAI"),
                        rs.getDate("NGAYCAP"),
                        rs.getString("SODT"),
                        rs.getString("MACN"));
                controller.arrayListKhachHang.add(kh);
            }
        } catch (SQLException ex) {
            Logger.getLogger(LoadData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static List<String> getLoaiGiaoDich() {
        List<String> list = new ArrayList<>();
        ResultSet rs = DataConnection.retrieveData("SELECT DISTINCT LOAIGD FROM GD_GOIRUT");
        try {
            while (rs.next()) {
                String loaiGiaoDich = rs.getString("LOAIGD");
                list.add(loaiGiaoDich);
            }
        } catch (SQLException ex) {
            Logger.getLogger(LoadData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    public static void loadTableGD_GoiRut() {
        ResultSet rs = DataConnection.retrieveData("select * from dbo.GD_GOIRUT");
        try {
            while (rs.next()) {
                GD_GUIRUT gr = new GD_GUIRUT(
                        rs.getInt("MAGD"),
                        rs.getString("SOTK"),
                        rs.getString("LOAIGD"),
                        rs.getDate("NGAYGD"),
                        rs.getLong("SOTIEN"),
                        rs.getString("MANV"));
                controller.arrayListGuiRut.add(gr);
            }
        } catch (SQLException ex) {
            Logger.getLogger(LoadData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void loadTableChuyenTien() {
        ResultSet rs = DataConnection.retrieveData("select * from dbo.GD_CHUYENTIEN");
        try {
            while (rs.next()) {
                GD_CHUYENTIEN ct = new GD_CHUYENTIEN(
                        rs.getInt("MAGD"),
                        rs.getString("SOTK_CHUYEN"),
                        rs.getDate("NGAYGD"),
                        rs.getLong("SOTIEN"),
                        rs.getString("SOTK_NHAN"),
                        rs.getString("MANV"));
                controller.arrayListChuyenTien.add(ct);
            }
        } catch (SQLException ex) {
            Logger.getLogger(LoadData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static List<getInfo> getCMND_SODU(String SOTK) {
        List<getInfo> infoList = new ArrayList<>();
        ResultSet rs = DataConnection.retrieveDataGoc("SELECT tk.CMND, kh.HO + ' ' + TEN as HOTEN, SODU FROM TaiKhoan tk, KhachHang kh WHERE SOTK = '" + SOTK + "'  AND tk.CMND = kh.CMND");
        try {
            while (rs.next()) {
                String cmnd = rs.getString("CMND");
                String hoten = rs.getString("HOTEN");
                long sodu = rs.getLong("SODU");
                getInfo info = new getInfo(cmnd, hoten, sodu);
                infoList.add(info);
            }
        } catch (SQLException ex) {
            Logger.getLogger(LoadData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return infoList;
    }

    public static List<String> getMaCN() {
        List<String> list = new ArrayList<>();
        ResultSet rs = DataConnection.retrieveDataGoc("SELECT DISTINCT MACN FROM ChiNhanh");
        try {
            while (rs.next()) {
                String MACN = rs.getString("MACN");
                list.add(MACN);
            }
        } catch (SQLException ex) {
            Logger.getLogger(LoadData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    public static void LietKeKhachHang() {
        ResultSet rs = DataConnection.retrieveData("EXEC [dbo].[SP_LietKeKhachHang]");
        try {
            while (rs.next()) {
                LietKeKhachHang kh = new LietKeKhachHang(
                        rs.getString("CMND"),
                        rs.getString("HOTEN"),
                        rs.getString("DIACHI"),
                        rs.getString("PHAI"),
                        rs.getDate("NGAYCAP"),
                        rs.getString("SODT"));
                controller.arrayListLietKeKhachHang.add(kh);
            }
        } catch (SQLException ex) {
            Logger.getLogger(LoadData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public LoadData() {
        controller.arrayListNhanVien.removeAll(controller.arrayListNhanVien);
        loadTableNhanVien();
        controller.arrayListKhachHang.removeAll(controller.arrayListKhachHang);
        loadTableKhachHang();
        controller.arrayListGuiRut.removeAll(controller.arrayListGuiRut);
        loadTableGD_GoiRut();
        controller.arrayListChuyenTien.removeAll(controller.arrayListChuyenTien);
        loadTableChuyenTien();
        controller.arrayListLietKeKhachHang.removeAll(controller.arrayListLietKeKhachHang);
        LietKeKhachHang();

    }
}
