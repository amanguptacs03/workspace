package com.psl.util;

import java.sql.DriverManager;

public class DBConnection {

	private static String url="jdbc:mysql://localhost:3306/BankDB";
	private  static String user="root";
	private static String pwd="root";
	private static java.sql.Connection conn=null;
	private static String driver="com.mysql.jdbc.Driver";
	
	
	
	public static java.sql.Connection getConnection(){
		if(conn==null){
			try {
				Class.forName(driver);
				conn=(java.sql.Connection) DriverManager.getConnection(url,user,pwd);
			} catch (Exception e) {
				System.out.println("COnnection Failed"+e);
			}
		}
		
		
		return conn;
	}
}
