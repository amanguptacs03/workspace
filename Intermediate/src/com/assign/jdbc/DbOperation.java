package com.assign.jdbc;

import java.io.IOException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class DbOperation {

	static PreparedStatement ps;
	static ResultSet rs;
	static Connection conn;

	public static void createTable() {
		try {
			if (conn == null)
				conn = DBConnection.getConnection();

			ps = conn
					.prepareStatement("create table emp( EMPNO     int(4)  NOT NULL,"
							+ "ENAME     VARCHAR(10) ,"
							+ "  JOB       VARCHAR(9),"
							+ " MGR       int(4),"
							+ "  HIREDATE  DATE,"
							+ " SAL       double(7,2),"
							+ "COMM      double(7,2)," + "DEPTNO    int(2))");
			ps.executeUpdate();

			System.out.println("Successfully created");

		} catch (SQLException e) {
			System.out.println("Creation FAiled " + e);
		}
	}

	public static void insertData() throws SQLException {

		Scanner obj = new Scanner(System.in);

		for (int j = 0; j < 2; j++) {
			Employee emp = new Employee();

			System.out.println("enter employment number :");
			emp.setEmp_no(obj.nextInt());
			System.out.println("enter emplyee name:");
			obj.nextLine();
			emp.setEmp_name(obj.nextLine());
			System.out.println("enter job:");
			emp.setJob(obj.next());
			System.out.println("enter mgr:");
			emp.setMgr(obj.nextInt());
			System.out.println("enter hire date");
			obj.nextLine();
			emp.setHire_date(Date.valueOf(obj.nextLine()));
			System.out.println("enter salary:");
			emp.setSalary(obj.nextDouble());
			System.out.println("enter comm:");
			emp.setComm(obj.nextDouble());
			System.out.println("enter department number");
			emp.setDept_no(obj.nextInt());

			try {
				if (conn == null)
					conn = DBConnection.getConnection();

				ps = conn
						.prepareStatement("insert into emp values(?,?,?,?,?,?,?,?)");
				ps.setInt(1, emp.getEmp_no());
				ps.setString(2, emp.getEmp_name());
				ps.setString(3, emp.getJob());
				ps.setInt(4, emp.getMgr());
				ps.setDate(5, emp.getHire_date());
				ps.setDouble(6, emp.getSalary());
				ps.setDouble(7, emp.getComm());
				ps.setInt(8, emp.getDept_no());
				int i = ps.executeUpdate();
				if (i > 0)
					System.out.println("inserted successfully");

			} catch (Exception e1) {
				System.out.println("insertion failed" + e1);
			}
		}

	}

	public static void printContentOfTable() {

		try {
			if (conn == null)
				conn = DBConnection.getConnection();

			ps = conn.prepareStatement("select * from emp limit 1");

			rs = ps.executeQuery();
			while (rs.next())
				System.out.println(rs.getInt("EMPNO") + "  |  "
						+ rs.getString("ENAME") + "  |  " + rs.getString("JOB")
						+ "  |  " + rs.getInt("MGR") + "  |  "
						+ rs.getDate("HIREDATE") + "  |  "
						+ rs.getDouble("SAL") + "  |  " + rs.getDouble("COMM")
						+ "  |  " + rs.getInt("DEPTNO"));

		} catch (Exception e1) {
			System.out.println("RETRIVAL failed" + e1);
		}

	}

	public static void userDemand() {

		Scanner obj = new Scanner(System.in);
		System.out.println("enter the employment number you want to search");
		int empno = obj.nextInt();
		display(empno);
		update(empno);
	}

	public static void display(int empno) {
		try {
			if (conn == null)
				conn = DBConnection.getConnection();

			ps = conn.prepareStatement("select * from emp where EMPNO=?");
			ps.setInt(1, empno);
			rs = ps.executeQuery();
			if (rs.next())
				System.out.println(rs.getInt("EMPNO") + "  |  "
						+ rs.getString("ENAME") + "  |  " + rs.getString("JOB")
						+ "  |  " + rs.getInt("MGR") + "  |  "
						+ rs.getDate("HIREDATE") + "  |  "
						+ rs.getDouble("SAL") + "  |  " + rs.getDouble("COMM")
						+ "  |  " + rs.getInt("DEPTNO"));
			else
				System.out.println("EMployment number does not exist");

		} catch (Exception e1) {
			System.out.println("Display failed" + e1);
		}

	}
	
	public static void update(int empno){
		try {
			Scanner obj =new Scanner(System.in);
			if(conn==null)
				conn = DBConnection.getConnection();
			ps=conn.prepareStatement("select SAL from emp where EMPNO=?");
			ps.setInt(1, empno);
			rs=ps.executeQuery();
			if(rs.next())
			System.out.println("Current salary:"+rs.getDouble(1));
			
			System.out.println("\n enter the new salary");
			double salary=obj.nextDouble();
			ps = conn.prepareStatement("update emp set SAL=? where EMPNO=? ");
			ps.setDouble(1, salary);
			ps.setInt(2, empno);
			ps.executeUpdate();
			
		} catch (Exception e) {
			System.out.println("UPDATION FAILED"+e);
			e.printStackTrace();
		}
	}

}
