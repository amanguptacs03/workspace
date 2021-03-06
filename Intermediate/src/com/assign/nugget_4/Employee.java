package com.assign.nugget_4;

import java.sql.Date;
import java.util.TreeSet;

public class Employee implements Comparable<Employee>{

	private int emp_no, dept_no;
	private double salary;
	private String emp_name;
	private Date hire_date;

	
	
	
	
	@Override
	public String toString() {
		return "Employee [emp_no=" + emp_no + ", dept_no=" + dept_no
				+ ", salary=" + salary + ", emp_name=" + emp_name
				+ ", hire_date=" + hire_date + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + emp_no;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (emp_no != other.emp_no)
			return false;
		return true;
	}

	public Employee() {
		super();
	}

	public Employee(int emp_no, int dept_no, double salary, String emp_name,
			Date hire_date) {
		super();
		this.emp_no = emp_no;

		this.dept_no = dept_no;
		this.salary = salary;

		this.emp_name = emp_name;

		this.hire_date = hire_date;
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

	public String getEmp_name() {
		return emp_name;
	}

	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}

	@Override
	public int compareTo(Employee e) {
		
		return e.emp_no-emp_no;
	}

}
