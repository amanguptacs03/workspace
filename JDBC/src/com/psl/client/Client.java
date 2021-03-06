package com.psl.client;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


import java.sql.Statement;

import com.psl.util.BankAccount;

public class Client {

	static{
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		Connection conn=null;
		try {
			BankAccount iron_man=new BankAccount("2345", 12345, "tony stark", Date.valueOf("2019-01-21"));
			BankAccount java_man=new BankAccount("8887", 1000005, "aman gupta", Date.valueOf("2015-06-03"));
			
		conn=	DriverManager.getConnection("jdbc:mysql://localhost:3306/cms", "root", "root");
		conn.setAutoCommit(false);            //for transaction purpose
		Statement st;
		st= conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE); //we have to write it to make resultset updatable and scrollable............. 
		
		String sql;
		sql=String.format("insert into tbl_bank_accounts values('%s','%s','%f','%s')", iron_man.getAccountNo(),iron_man.getFullName(),iron_man.getAmount(),iron_man.getOpenedOn());
		
		//st.executeUpdate(sql);
		sql=String.format("insert into tbl_bank_accounts values('%s','%s','%f','%s')", java_man.getAccountNo(),java_man.getFullName(),java_man.getAmount(),java_man.getOpenedOn());
		//st.executeUpdate(sql);
		
		ResultSet rs;
		rs=st.executeQuery("select * from tbl_bank_accounts");
		while(rs.next())
		{
			System.out.println(rs.getString("account_number"));
			System.out.println(rs.getString("full_name"));
			System.out.println(rs.getDouble("balance"));
			System.out.println(rs.getDate("opening_date"));
			System.out.println("=========================================================");
		}
		
		while(rs.previous())												//make back account object here and populate the list
		{
			System.out.println(rs.getString("account_number"));
			System.out.println(rs.getString("full_name"));
			System.out.println(rs.getDouble("balance"));
			System.out.println(rs.getDate("opening_date"));
			System.out.println("=========================================================");
		}
		rs.absolute(2);
		rs.relative(-1);
		rs.updateDouble("balance", 100000);
		rs.updateRow();
		
		
		
		
		
		st.close();
		
		PreparedStatement ps;
		ps=conn.prepareStatement("insert into tbl_bank_accounts values(?,?,?,?)");
		ps.setString(1, "456");
		ps.setString(2, "radhe lal");
		ps.setDouble(3, 363.3);
		ps.setDate(4, Date.valueOf("2004-11-17"));;
		
		ps.executeUpdate();
		
		conn.commit();   //we need commit bcoz we are using setautocommit
		
		conn.getMetaData();  //important
		rs.getMetaData();
		
		
		} catch (SQLException e) {
		e.printStackTrace();
		}finally{
			if(conn!=null){
				try {
					conn.close();
				} catch (SQLException e2) {
				e2.printStackTrace();
				}
			}
		}
		
	}
	
}
