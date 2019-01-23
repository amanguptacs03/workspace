package com.psl.model;

public abstract class Shape {

	private String name;
	private double area,perimeter;

	public Shape(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	protected void setName(String name) {
		this.name = name;
	}

	public double getArea() {
		return area;
	}

	protected void setArea(double area) {
		this.area = area;
	}

	public double getPerimeter() {
		return perimeter;
	}

	protected void setPerimeter(double perimeter) {
		this.perimeter = perimeter;
	}
	
	public abstract void calculatePeimeter();
	public  abstract void calculateArea();
	
}
