package com.javamaven.dao;

import com.fasterxml.jackson.databind.util.ClassUtil;
import com.javamaven.connect.DataConnection;
import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
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
public class LoginDao {
 private static int check = 0;
  public static int getCheck() {
        return check;
    }
    public static void exec_dangnhap(String tenlogin) {
        ResultSet rs = DataConnection.retrieveData("EXEC [dbo].[SP_DangNhap]");
        try {
            while (rs.next()) {
                // Lấy thông tin đăng nhập từ ResultSet
                String username = rs.getString("username");
                System.out.println(username);
                // Xử lý thông tin đăng nhập tại đây
            }

            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(DataConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static Map<String, String> getV_DS_PHANMANH() {
        Map<String, String> map = new HashMap<>();
        ResultSet rs = DataConnection.retrieveDataGoc("SELECT TENSERVER, TENCN FROM V_DS_PHANMANH");
        try {
            while (rs.next()) {
                // Lấy thông tin đăng nhập từ ResultSet
                String TENSERVER = rs.getString("TENSERVER");
                String TENCN = rs.getString("TENCN");
                map.put(TENCN, TENSERVER);
            }
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(DataConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return map;
    }

    public static void taoTaiKhoan(String LGname, String Pass, String Username, String Role) {
        try {
            String sqlCommand = "{CALL [dbo].[SP_TaoTaiKhoan](?, ?, ?, ?, ?)}";

            DataConnection.KetNoi(DataConnection.servername, DataConnection.username, DataConnection.password);
            CallableStatement cs = DataConnection.connection2.prepareCall(sqlCommand);
            cs.setString(1, LGname);
            cs.setString(2, Pass);
            cs.setString(3, Username);
            cs.setString(4, Role);
            cs.registerOutParameter(5, Types.INTEGER); // Đăng ký tham số OUTPUT
            cs.executeUpdate();
            check = cs.getInt(5); // Lấy giá trị của tham số OUTPUT @CHECK
            cs.close();
        } catch (Exception ex) {
          
        }
       
    }

}
