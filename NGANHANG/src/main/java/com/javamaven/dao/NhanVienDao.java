/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.javamaven.dao;

import com.javamaven.connect.DataConnection;
import com.javamaven.entity.NHANVIEN;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author admin
 */
public class NhanVienDao {
    public static Map<String, String> get_CNChuyen(String MaCN) {
    Map<String, String> map = new HashMap<>();
    ResultSet rs = DataConnection.retrieveDataGoc("EXEC [dbo].[SP_GetCNChuyen] " + MaCN);
    try {
        while (rs.next()) {
            // Lấy thông tin đăng nhập từ ResultSet
            String MACN = rs.getString("MACN");
            String TENCN = rs.getString("TENCN");
            map.put(TENCN, MACN);
        }
        rs.close();
    } catch (SQLException ex) {
        Logger.getLogger(DataConnection.class.getName()).log(Level.SEVERE, null, ex);
    }
    return map;
}
     public static void insertNhanVien(String Ho, String Ten, String Cmnd, String DiaChi, String Phai, String SoDT, String Manc) {
        String sqlCommand = "EXEC [dbo].[SP_THEM_NHANVIEN] ?,?,?,?,?,?,?";
        try {
            DataConnection.KetNoi(DataConnection.servername, DataConnection.username, DataConnection.password);
            PreparedStatement ps = DataConnection.connection2.prepareStatement(sqlCommand);
           ps.setString(1, Ho);
           ps.setString(2, Ten);
           ps.setString(3, Cmnd);
           ps.setString(4, DiaChi);
           ps.setString(5, Phai);
           ps.setString(6, SoDT);
           ps.setString(7 , Manc);
           
           
            ps.executeUpdate();

            System.out.println("thanh cong");
        } catch (SQLException ex) {
            Logger.getLogger(NhanVienDao.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
     public static void updateNhanVien(NHANVIEN nv,String MaNV) {
        String sqlCommand = "UPDATE dbo.NhanVien set HO=?,TEN=?,CMND=?,DIACHI=?,PHAI=?,SODT=? WHERE MANV=?";
        try {
            DataConnection.KetNoi(DataConnection.servername, DataConnection.username, DataConnection.password);
            PreparedStatement ps = DataConnection.connection2.prepareStatement(sqlCommand);          
            ps.setString(1, nv.getHO());
            ps.setString(2, nv.getTEN());
            ps.setString(3, nv.getCMND());
            ps.setString(4, nv.getDIACHI());
            ps.setString(5, nv.getPHAI());
            ps.setString(6, nv.getSODT());
             ps.setString(7, MaNV);
            ps.executeUpdate();

            System.out.println("thanh cong");
        } catch (SQLException ex) {
            Logger.getLogger(NhanVienDao.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    public static void ChuyeCN(String MaNV, String MaCN) {
       String sqlCommand = "EXEC [dbo].[SP_ChuyenCN] ?,?";
    try {
        DataConnection.KetNoi(DataConnection.servername, DataConnection.username, DataConnection.password);
        PreparedStatement ps = DataConnection.connection2.prepareStatement(sqlCommand);  
        ps.setString(1,MaNV);
        ps.setString(2, MaCN);
        ps.executeUpdate();
    } catch (SQLException ex) {
        Logger.getLogger(NhanVienDao.class.getName()).log(Level.SEVERE, null, ex);
    }
    }
}
