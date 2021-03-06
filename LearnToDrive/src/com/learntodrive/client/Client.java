package com.learntodrive.client;

import com.learn2drive.util.FuelType;
import com.learntodrive.model.Car;
import com.learntodrive.model.SUV;
import com.learntodrive.model.Sedan;
import static java.lang.Math.sqrt;
public class Client extends Car {

public void m(){
//	String a is accessible but not String b here as it is default member  in car class
	sqrt(12);//can use without class reference
}
	
	
	public static void main(String[] args) {
		com.learntodrive.model.Car xuv, baleno;
		xuv = new Car();

		xuv.setMake("Mahindra");
		xuv.setModel("XUV 500");
		xuv.setColor("Black");
		System.out.println(xuv.toString());

		System.out.println(xuv.getMake());
		System.out.println(xuv.getModel());
		System.out.println(xuv.getColor());

		baleno = new Car();

		baleno.setMake("NEXA");
		baleno.setModel("ASTA");
		baleno.setColor("Blue");

		System.out.println(baleno.getMake());
		System.out.println(baleno.getModel());
		System.out.println(baleno.getColor());

		baleno = new Car("maruti", "baleno RS", "blue");
		SUV rexton = new SUV("rexton", "abc", "black", true);

		Sedan ciaz = new Sedan();
		ciaz.setMake("maruti");
		ciaz.setModel("xyz");
		ciaz.setColor("black");
		ciaz.setConvertible(false);
		
		
		

		carManager(xuv);// car----->at here car tostring method will call
		carManager(baleno);// car
		carManager(rexton);// suv-->here it check in sub class for tostring but there is no such method then send it to super class.RUNTIME POLYMORPHISM:(Dynamic method Dispatch)
		carManager(ciaz);// sedan

		
		//------>Enum Concept
		FuelType f; //enum variable
		f=FuelType.NATURAL_GAS;
		
		FuelType.DIESEL.getGetCombustionTemperature();
		
		
		
		switch(f){
		case DIESEL:
		case PETROL:
		case NATURAL_GAS:
		}
		
	//	FuelType.valueOf(arg0);
		
		for(FuelType ft:FuelType.values())
		{
			System.out.println(ft);
			System.out.println(ft.getGetCombustionTemperature());
		}
	}

	// super class reference to the subclass object---->adv:
	public static void carManager(Car car) {
//		System.out.println(car.getColor());
//		System.out.println(car.getMake());
//		System.out.println(car.getModel());
		
		System.out.println(car.toString());
	}

}
