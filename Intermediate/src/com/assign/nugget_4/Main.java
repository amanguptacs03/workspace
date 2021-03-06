package com.assign.nugget_4;

import java.awt.DisplayMode;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import com.assign.jdbc.Employee;

public class Main {

	static Set<com.assign.nugget_4.Employee> ts = new TreeSet<com.assign.nugget_4.Employee>();

	public static void main(String[] args) {

		Scanner obj = new Scanner(System.in);
		showUI();
		loop: while (true) {
			showUI();
			System.out.println("\n\n\n\n");
			
			switch (obj.nextInt()) {
			case 1: {
				insert();

				break;
			}
			case 2: {
				display();
				break;
			}
			case 3: {
				System.out.println("Enter the before Date");
				Date d = Date.valueOf(obj.next());
				beforeDate(d);
				break;
			}
			case 4: {
			System.out.println("Employee that have complete six month in the company ");
			sixMonth();
			break;
			}
			case 5: {
				System.out.println("Sort by joining date :");
				sortJoiningDate();
				break;
			}
			case 6: {
				break loop;
			}


			default: {
				System.out.println("please enter a valid choice");
				break;
			}

			}

		}
	}

	public static void showUI() {

		System.out
				.println("--------------EMPLOYEE OPERATIONS-------------------");

		System.out
				.println("1. insert details \n 2.display information \n 3. show the employee before given date \n4.complete six month \n5.sort by joining date \n6Exit");
		System.out.println("ENTER YOUR CHOICE");

	}

	public static void insert() {

		Scanner obj = new Scanner(System.in);

		for (int j = 1; j < 2; j++) {
			com.assign.nugget_4.Employee emp = new com.assign.nugget_4.Employee();

			System.out.println("Employee   :" + j + 1);
			System.out.println("enter employment number :");
			emp.setEmp_no(obj.nextInt());

			System.out.println("enter emplyee name:");
			obj.nextLine();
			emp.setEmp_name(obj.nextLine());

			System.out.println("enter hire date");
		
			emp.setHire_date(Date.valueOf(obj.nextLine()));
			obj.nextLine();

			System.out.println("enter salary:");
			emp.setSalary(obj.nextDouble());

			System.out.println("enter department number");
			emp.setDept_no(obj.nextInt());

			ts.add(emp);
		}

	}

	public static void display() {
		System.out.println(ts);
	}

	public static void beforeDate(Date d) {
		for (com.assign.nugget_4.Employee emp : ts) {
			if (emp.getHire_date().before(d))
				System.out.println(emp);
		}
	}

	public static void sixMonth() {
		for (com.assign.nugget_4.Employee emp : ts) {
		
//			SimpleDateFormat sdf = new SimpleDateFormat("MM");
//			int i = Integer.parseInt(sdf.format(emp.getHire_date()));
//			LocalDateTime now = LocalDateTime.now();
//			int n=now.getMonthValue();
//			int n = Integer.parseInt(sdf.format(now));
		//	System.out.println(now.getMonthValue() + ": for debug");
//			if(n-i>=6)
//				System.out.println(emp);
		
			Calendar c=Calendar.getInstance();
			c.setTime(emp.getHire_date());
			
			
			c.add(c.MONTH, 7);
		
			Calendar ch=Calendar.getInstance();
			ch.setTime(new java.util.Date());
			
			
		if(c.before(ch))
				System.out.println(emp);
		}
	}


	public static void sortJoiningDate(){
	List<com.assign.nugget_4.Employee> ll=new ArrayList<com.assign.nugget_4.Employee>();
	ll.addAll(ts);
	Collections.sort(ll, new JoiningdateComparator());
	}
}
