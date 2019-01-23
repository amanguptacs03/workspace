package com.psl.model;

public class Circle extends Shape {

	private double radius;

	public Circle(double radius) {
		super("Circle");
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
@Override
	public void calculateArea() {
		setArea(Math.PI*getRadius()*getRadius());

	}
@Override
	public void calculatePeimeter() {
		setPerimeter(2*Math.PI*getRadius());

	}
}
