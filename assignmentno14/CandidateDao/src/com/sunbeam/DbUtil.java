package com.sunbeam;

import java.sql.*;

public class DbUtil {
	
	public static final String DB_DRIVER = "com.mysql.cj.jdbc.Driver" ;
	public static final String DB_URL = "jdbc:mysql://localhost:3306/javaDAO" ;
	public static final String DB_USER = "kd1_80106_Shrilekh";
	public static final String DB_PASSWD = "manager" ;
	
	
	// step 2 block : LOAD AND REGISTER JDBC DRIVER CLASS 
	static {
		try {
			Class.forName(DB_DRIVER);
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
			System.exit(-1);
		}
		
	}
	
	// STEP 3 : ESTABLISH CONNECTION WITH DATABASE 
	public static Connection getConnection() throws SQLException {
		Connection con = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWD);
		return con;
	}
	
	

}
