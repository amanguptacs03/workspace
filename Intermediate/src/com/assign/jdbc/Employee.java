package com.assign.jdbc;

import java.sql.Date;



public class Employee {

	private int emp_no,mgr,dept_no;
	private double salary,comm;
	private String emp_name,job;
	private Date hire_date;
	
	
	
	
	public Employee() {
		super();
	}




	public Employee(int emp_no, int mgr, int dept_no, double salary,
			double comm, String emp_name, String job,Date hire_date) {
		super();
		this.emp_no = emp_no;
		this.mgr = mgr;
		this.dept_no = dept_no;
		this.salary = salary;
		this.comm = comm;
		this.emp_name = emp_name;
		this.job = job;
		this.hire_date=hire_date;
	}




	public Date getHire_date() {
		return hire_date;
	}




	public void setHire_date(Date hire_date) {
		this.hire_date = hire_date;
	}




	public int getEmp_no() {
		return emp_no;
	}




	public void setEmp_no(int emp_no) {
		this.emp_no = emp_no;
	}




	public int getMgr() {
		return mgr;
	}




	public void setMgr(int mgr) {
		this.mgr = mgr;
	}




	public int getDept_no() {
		return dept_no;
	}




	public void setDept_no(int dept_no) {
		this.dept_no = dept_no;
	}




	public double getSalary() {
		return salary;
	}




	public void setSalary(double salary) {
		this.salary = salary;
	}




	public double getComm() {
		return comm;
	}




	public void setComm(double comm) {
		this.comm = comm;
	}




	public String getEmp_name() {
		return emp_name;
	}




	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}




	public String getJob() {
		return job;
	}




	public void setJob(String job) {
		this.job = job;
	}
	
	
}
