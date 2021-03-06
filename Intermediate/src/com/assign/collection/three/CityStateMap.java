package com.assign.collection.three;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class CityStateMap {

	private  String city,state;
	private Map<String, HashSet<String>> m =new HashMap<String, HashSet<String>>();
	

	Scanner obj=new Scanner(System.in);
	
	
	public void readFromFile(String file){
		
	try {	
		FileReader fr=new FileReader(file);
		  
		BufferedReader br=new BufferedReader(fr);
		String s;
		while((s=br.readLine())!=null) {
			String[] str=s.split(",");
			HashSet<String> hs=m.getOrDefault(str[1], new HashSet<String>());
			hs.add(str[0]);		
			m.put(str[1],hs);
		}
		
	}catch (FileNotFoundException e) {
		System.out.println("file not found!!!");
	}catch (IOException e) {
		System.out.println("IO exception!!");
	}
	}
	
	
	
	public  void addCityStatePair() {
		obj=new Scanner(System.in);
		System.out.println("Enter the city you want to add");
		city=obj.nextLine();
		
		System.out.println("Enter the state of the city");
		state=obj.nextLine();
		
		
		HashSet<String> hs=m.getOrDefault(state, new HashSet<String>());
		hs.add(city);		
		m.put(state,hs);
	
		for(Map.Entry<String,HashSet<String>> mi:m.entrySet()) {
		
			System.out.println(mi.getKey()+"===================="+mi.getValue());}
	
			
		}
	
	public String getState() {
		System.out.println("enter the city name");
		city=obj.nextLine();
		for (String state : m.keySet()) 
			if(m.get(state).contains(city))
				return state;	
		return "Not-Found";
	}
		
	    
	    		   		
	public void getAllCity() {
		
		for(HashSet<String> al:m.values())
		System.out.println(al);
	}
	
	public HashSet<String> getAllState() {
		
		Set<String> al=  m.keySet();
		HashSet<String> hs=new HashSet<String>();
		hs.addAll(al);
			return hs;
			
	}
	public HashSet<String> getStateCities() {
		System.out.println("enter the name of the state");
		state=obj.nextLine();
		HashSet<String> hs=m.getOrDefault(state, new HashSet<String>());
		return hs;
	}
	
	public void deleteAllCities() {
		System.out.println("enter the state name");
		state=obj.nextLine();
		m.remove(state);

	for(Map.Entry<String,HashSet<String>> mi:m.entrySet()) {
		System.out.println(mi.getKey()+"===================="+mi.getValue());}

		}

	}


	