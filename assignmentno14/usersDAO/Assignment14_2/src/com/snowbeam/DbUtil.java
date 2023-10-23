package com.snowbeam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbUtil {
	
	private static final String DB_DRIVER = "com.mysql.cj.jdbc.Driver" ;
	private static final String DB_URL = "jdbc:mysql://localhost:3306/javaDAO" ; 
	private static final String DB_USER = "kd1_80106_Shrilekh" ;
	private static final String DB_PASSWD = "manager" ;
	
	
	//step2 : LOAD AND REGISTER JDBC DRIVER CLASS 
    static {
    	try {
    		Class.forName(DB_DRIVER); 
    	}catch (ClassNotFoundException e) {
    			e.printStackTrace();
    			System.exit(1);
    		}
    }	
    	
    //STEP3 : GET DATABASE CONNECTION 	
    	
    	public static Connection getConnection() throws SQLException{
    		 Connection con =  DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWD);
    		 return con;
    	}
  	

//    	public static Connection getConnection() throws SQLException {
//    		Connection con = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWD);
//    		return con;
//    	}
    	
    	
    }


