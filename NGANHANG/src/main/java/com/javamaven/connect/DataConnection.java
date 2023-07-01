package com.javamaven.connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DataConnection {

    public static String connstr;
    public static String connstr_publisher = "jdbc:sqlserver://DESKTOP-1NUUP69\\SQLSONSEVER;databaseName=NGANHANG;"
                + " encrypt=true;trustServerCertificate=true;sslProtocol=TLSv1.2";
    public static String servername = "";
    public static String username = "";
    public static String mlogin = "";
    public static String password = "";
    public static String database = "NGANHANG";
    public static String remotelogin = "HTKN";
    public static String remotepassword = "1234";
    public static String mloginDN = "";
    public static String passwordDN = "";
    public static String mGroup = "";
    public static String mHoten = "";
    public static String mUsername = "";
    public static String mCN = "";
    public static int mChinhanh = 0;
    public static Connection connection1;
    public static Connection connection2;
     public static Statement statement1;
    public static Statement statement2;
    
     public static ResultSet retrieveDataGoc(String sqlCommand) {
        try {
            createConnections();
            Statement statementGoc = statement1;           
            ResultSet resultSet = statementGoc.executeQuery(sqlCommand);
            return resultSet;
        } catch (SQLException ex) {
            Logger.getLogger(DataConnection.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
      public static ResultSet retrieveData(String sqlCommand) {
        try {
            KetNoi(servername, username, password);
            Statement statement = statement2;           
            ResultSet resultSet = statement.executeQuery(sqlCommand);
            System.err.println("TruyVanThanhCong");
            return resultSet;
        } catch (SQLException ex) {
            Logger.getLogger(DataConnection.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
      public static int KetNoi(String serverPM,String userPM,String passPM){
           String connect = "jdbc:sqlserver://"+serverPM+";databaseName=NGANHANG;"
                + " encrypt=true;trustServerCertificate=true;sslProtocol=TLSv1.2";
             servername = serverPM;
             username = userPM;
             password = passPM ;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection2 = DriverManager.getConnection(connect, userPM, passPM);
            statement2 = connection2.createStatement();
            System.err.println("THANHCONG");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DataConnection.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DataConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 1;
      }
    public static int createConnections(){
        String serverGoc = "sa";
        String passGoc = "1234";
         try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection1 = DriverManager.getConnection(connstr_publisher, serverGoc, passGoc);
            statement1 = connection1.createStatement();
            System.err.println("THANHCONG");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DataConnection.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DataConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 1;
    }
    
      public static void main(String[] args) {
        createConnections();
    }
}
