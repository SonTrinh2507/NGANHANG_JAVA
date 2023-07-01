/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.javamaven.dao;

import com.javamaven.connect.DataConnection;
import com.javamaven.function.SaoKeTemp;
import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author admin
 */
public class GiaoDichDao {

    private static int check = 0;

    public static int getCheck() {
        return check;
    }

    public static void exec_GDGuiRut(String SOTK, String LOAIGD, long SOTIEN, String MANV) {
        try {
            String sqlCommand = "{CALL [dbo].[SP_GDGoiRut] (?,?,?,?,?)}";
            DataConnection.KetNoi(DataConnection.servername, DataConnection.username, DataConnection.password);
            CallableStatement cs = DataConnection.connection2.prepareCall(sqlCommand);
            cs.setString(1, SOTK);
            cs.setString(2, LOAIGD);
            cs.setLong(3, SOTIEN);
            cs.setString(4, MANV);
            cs.registerOutParameter(5, java.sql.Types.INTEGER); // Đăng ký tham số OUTPUT
            cs.execute();
            check = cs.getInt(5); // Lấy giá trị của tham số OUTPUT @CHECK
            cs.close();
        } catch (SQLException ex) {
            Logger.getLogger(GiaoDichDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void exec_GDChuyenTien(String SOTK_CHUYEN, String SOTK_NHAN, long SOTIEN, String MANV) {
        try {
            String sqlCommand = "{CALL [dbo].[SP_ChuyenTien] (?,?,?,?,?)}";
            DataConnection.KetNoi(DataConnection.servername, DataConnection.username, DataConnection.password);
            CallableStatement cs = DataConnection.connection2.prepareCall(sqlCommand);
            cs.setString(1, SOTK_CHUYEN);
            cs.setString(2, SOTK_NHAN);
            cs.setLong(3, SOTIEN);
            cs.setString(4, MANV);
            cs.registerOutParameter(5, java.sql.Types.INTEGER); // Đăng ký tham số OUTPUT
            cs.execute();
            check = cs.getInt(5); // Lấy giá trị của tham số OUTPUT @CHECK
            cs.close();
        } catch (SQLException ex) {
            Logger.getLogger(GiaoDichDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void exec_SaoKeGD(String TUNGAY, String DENNGAY, String SOTK) {
        try {
            String sqlCommand = "{CALL [dbo].[SP_SaoKeGD] (?,?,?)}";
            DataConnection.KetNoi(DataConnection.servername, DataConnection.username, DataConnection.password);
            CallableStatement cs = DataConnection.connection2.prepareCall(sqlCommand);           
            cs.setString(1, TUNGAY);
            cs.setString(2, DENNGAY);
            cs.setString(3, SOTK);
            cs.execute();
            cs.close();
        } catch (SQLException ex) {
            Logger.getLogger(GiaoDichDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

   public static List<SaoKeTemp> getTamRecords() {
        List<SaoKeTemp> tamRecords = new ArrayList<>();

        try {
        ResultSet rs = DataConnection.retrieveData("SELECT * FROM ##TAM");

            while (rs.next()) {
                long SODUDAU = rs.getLong("SODUDAU");
                String NGAYGD = rs.getString("NGAYGD");
                String LOAIGD = rs.getString("LOAIGD");
                long SOTIEN =  rs.getLong("SOTIEN");
                long SODUSAU = rs.getLong("SODUSAU");
                String MACN = rs.getString("MACN");
                SaoKeTemp sk = new SaoKeTemp(SODUDAU, NGAYGD, LOAIGD, SOTIEN, SODUSAU, MACN);
                tamRecords.add(sk);
            }
             
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(GiaoDichDao.class.getName()).log(Level.SEVERE, null, ex);
        }

        return tamRecords;
    } 

}

