package com.learntodrive.model;

import com.learn2drive.util.FuelType;

public class vehicle {

	private String regNo,name;
	private double price;
	FuelType fuelType;
	
	public vehicle() {
		super();
	}
	
	
	public String getRegNo() {
		return regNo;
	}
	public void setRegNo(String regNo) {
		this.regNo = regNo;
	}
	public String getName() {
		return name;
	}
	public vehicle(String regNo, String name, double price, FuelType fuelType) {
		super();
		this.regNo = regNo;
		this.name = name;
		this.price = price;
		this.fuelType = fuelType;
	}


	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public FuelType getFuelType() {
		return fuelType;
	}
	public void setFuelType(FuelType fuelType) {
		this.fuelType = fuelType;
	}
	
	
}
