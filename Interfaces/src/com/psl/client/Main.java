package com.psl.client;

public class Main {

	public static void main(String[] args) {
		driveVehicle(new BatMobile());
		driveVehicle(new Truck());
		
              int x= MyDummyClass.variable;
		
		final Vehicle v=new Vehicle();
         //       v=new Vehicle(); ---->compile time error because of an re initilization
	}
public static void driveVehicle(Drivable d){
	d.accelerate();
	d.steer();
}
}
