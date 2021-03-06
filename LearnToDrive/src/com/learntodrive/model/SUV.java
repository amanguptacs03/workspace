package com.learntodrive.model;

public class SUV extends Car {
	private boolean fourWheelDrive;

	public SUV() {
	super();//optional
		fourWheelDrive = false;
	}

	public SUV(String make, String model, String color, boolean fourWheelDrive) {
		super(make, model, color);//should be the first statement
		this.fourWheelDrive = fourWheelDrive;
	}

	public boolean isFourWheelDrive() {
		return fourWheelDrive;
	}

	public void setFourWheelDrive(boolean fourWheelDrive) {
		this.fourWheelDrive = fourWheelDrive;
	}

	@Override
	public String toString() {
	return super.toString()+" "+this.fourWheelDrive;
	}
}
