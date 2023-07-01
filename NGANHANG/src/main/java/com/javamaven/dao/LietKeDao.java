/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.javamaven.dao;

import com.javamaven.connect.DataConnection;
import com.javamaven.connect.LoadData;
import com.javamaven.controller.controller;
import com.javamaven.function.LietKeKhachHang;
import com.javamaven.function.LietKeTaiKhoan;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author admin
 */
public class LietKeDao {
    public static List<LietKeTaiKhoan> exec_SaoKeGD(String TUNGAY, String DENNGAY, int ALL) {
        List<LietKeTaiKhoan> list = new ArrayList<>();
        try {
            String sqlCommand = "{CALL [dbo].[SP_LietKeTaiKhoan] (?,?,?)}";
            DataConnection.KetNoi(DataConnection.servername, DataConnection.username, DataConnection.password);
            CallableStatement cs = DataConnection.connection2.prepareCall(sqlCommand);           
            cs.setString(1, TUNGAY);
            cs.setString(2, DENNGAY);
            cs.setInt(3, ALL);
            ResultSet resultSet = cs.executeQuery();
             while (resultSet.next()) {
                String sotk = resultSet.getString("SOTK");
                String ngayMoTK = resultSet.getString("NGAYMOTK");
                String maCN = resultSet.getString("MACN");
                LietKeTaiKhoan kh = new LietKeTaiKhoan(sotk, ngayMoTK, maCN);
                list.add(kh);
             }
            cs.close();
            resultSet.close();
        } catch (SQLException ex) {
            Logger.getLogger(GiaoDichDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
    
    

}
