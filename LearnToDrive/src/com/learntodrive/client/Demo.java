package com.learntodrive.client;

import com.learn2drive.util.FuelType;
import com.learntodrive.model.vehicle;

public class Demo {
	
	public static vehicle[] readCSV(String[] data){
		vehicle[] ve=new vehicle[data.length];
		for(String i:data){
			String[] temp=i.split(",");
			vehicle v=new vehicle(temp[0],temp[2],Double.parseDouble(temp[1]),FuelType.valueOf(temp[3]));
			
			
			int j=0;
				
				ve[j++]=v;
				
			
			
			
		
				}

		return ve;
		
	}

	public static void main(String[] args) {
		String[] arr = { "MH-31-3656,124578.00,Dominar,Natural_gas",
				" MH-49-6768,36568.00,Activa,Petrol",
				"MH-20-5676,376895,BMW-GS,Diesel" };
		
		for(vehicle i:readCSV(arr)){
		System.out.println("REgNo:"+i.getRegNo());	
		System.out.println("REgNo:"+i.getName());	
		System.out.println("REgNo:"+i.getPrice());	
		System.out.println("REgNo:"+i.getFuelType());	
		
		}
		}
}
