package com.psl.client;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class UserInterface {
	public static void main(String[] args) throws FileNotFoundException  {
		 Car car=new Car();
		 car.setMake("Audi");
		 car.setModel("A-Tron");
		 car.setColor("Black");
		 car.setEngine(new Engine(125, 1000, FuelType.DIESEL));
		 
		 
		 Car car1=new Car();
		 car1.setMake("maruti");
		 car1.setModel("800");
		 car1.setColor("Black");
		 car1.setEngine(new Engine(125, 1000, FuelType.NATURAL_GAS));
		 
		 
		 Car car2=new Car();
		 car2.setMake("honda");
		 car2.setModel("honda city");
		 car2.setColor("Black");
		 car2.setEngine(new Engine(125, 1000, FuelType.PETROL));
		 
		 
		 
	try(	
			
			ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(new File("car.ser")))){
		
		oos.writeObject(car);
		oos.writeObject(car1);
		oos.writeObject(car2);
		
	}catch (Exception e) {
		e.printStackTrace();
	}
	
	FileInputStream fi=	new FileInputStream(new File("car.ser"));
	

	try(ObjectInputStream oi=new ObjectInputStream(fi)){
		
		Car c;
	//	while((c=(Car)oi.readObject())!=null){
		while(fi.available()>0&&(c=(Car)oi.readObject())!=null)
		{
			
		System.out.println(c.toString());
//		System.out.println(c.getMake());
//		System.out.println(c.getModel());
//		System.out.println(c.getColor());
//		System.out.println(c.getEngine().getFuelType());
		
	}
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
 
	
	
	
  
  
}
