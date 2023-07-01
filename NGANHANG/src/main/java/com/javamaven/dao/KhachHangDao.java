/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.javamaven.dao;

import com.javamaven.connect.DataConnection;
import com.javamaven.entity.KHACHHANG;
import java.sql.CallableStatement;
import java.sql.Date;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Types;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author admin
 */
public class KhachHangDao {

    private static int check = 0;

    public static int getCheck() {
        return check;
    }

    public static void exec_KhachHang(String CMND, String HO, String TEN, String DIACHI, String PHAI, Date NGAYCAP, String SODT, String MACN) {
        try {
            String sqlCommand = "{CALL [dbo].[SP_CheckCMND] (?,?,?,?,?,?,?,?,?)}";
            DataConnection.KetNoi(DataConnection.servername, DataConnection.username, DataConnection.password);
            CallableStatement cs = DataConnection.connection2.prepareCall(sqlCommand);
            cs.setString(1, CMND);
            cs.setString(2, HO);
            cs.setString(3, TEN);
            cs.setString(4, DIACHI);
            cs.setString(5, PHAI);
            java.util.Date ngayCapUtil = NGAYCAP;
            java.sql.Date ngayCapSql = new java.sql.Date(ngayCapUtil.getTime());
            cs.setDate(6, ngayCapSql);
            cs.setString(7, SODT);
            cs.setString(8, MACN);
            cs.registerOutParameter(9, java.sql.Types.INTEGER); // Đăng ký tham số OUTPUT
            cs.execute();
            check = cs.getInt(9); // Lấy giá trị của tham số OUTPUT @CHECK
            cs.close();
            System.err.println("check la" + check);

        } catch (SQLException ex) {
            Logger.getLogger(KhachHangDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void exec_MoTaiKhoan(String CMND, String MACN) {
        try {
           String sqlCommand = "{CALL [dbo].[SP_MoTaiKhoan]  (?,?)}";
            DataConnection.KetNoi(DataConnection.servername, DataConnection.username, DataConnection.password);
            CallableStatement cs = DataConnection.connection2.prepareCall(sqlCommand);
            cs.setString(1, CMND);
            cs.setString(2, MACN);
            cs.execute();
            cs.close();
            

        } catch (SQLException ex) {
            Logger.getLogger(KhachHangDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void updateKhachHang(KHACHHANG kh,String CMND) {
        String sqlCommand = "UPDATE dbo.KhachHang set HO=?,TEN=?,DIACHI=?,PHAI=?,NGAYCAP=?,SODT=? WHERE CMND=?";
        try {
            DataConnection.KetNoi(DataConnection.servername, DataConnection.username, DataConnection.password);
            PreparedStatement ps = DataConnection.connection2.prepareStatement(sqlCommand);          
            ps.setString(1, kh.getHO());
            ps.setString(2, kh.getTEN());
            ps.setString(3, kh.getDIACHI());
            ps.setString(4, kh.getPHAI());
            ps.setDate(5, kh.getNGAYCAP());
            ps.setString(6, kh.getSODT());
             ps.setString(7, CMND);
             
            ps.executeUpdate();

            System.out.println("thanh cong");
        } catch (SQLException ex) {
            Logger.getLogger(NhanVienDao.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
