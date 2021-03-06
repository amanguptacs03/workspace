package com.assign.collection.three;

import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void showUI() {
		System.out.println(String.format("%30s", " ") + "START Operation!!!");
		
		System.out.println(String.format("%15s", " ") + "1. Add city-state pair");
		System.out.println(String.format("%15s", " ") + "2. Get city state");
		System.out.println(String.format("%15s", " ") + "3. Get all city");
		System.out.println(String.format("%15s", " ") + "4. Get all state");
		System.out.println(String.format("%15s", " ") + "5. Cities of state");
		System.out.println(String.format("%15s", " ") + "6. Delete cities for state");
		System.out.println(String.format("%15s", " ") + "7. EXIT");
		
		System.out.println("\n\n\nENTER YOUR CHOICE");
	}
	public static void main(String[] args) {
		CityStateMap csm=new CityStateMap();
		csm.readFromFile("cityState.txt");
		Scanner obj=new Scanner(System.in);

int x=0;
		
		loop : while(true)
		{	showUI();
			switch (obj.nextInt()) {
			case 1:
			{
				csm.addCityStatePair();
				
				break;
			}
			case 2:
			{
				System.out.println(csm.getState());
			break;
			}
			case 3:{
				csm.getAllCity();
				break;
			}
			case 4:
			{
				System.out.println(csm.getAllState());
				break;
			}
			case 5:
			{
				System.out.println(csm.getStateCities());
				break;
			}
			case 6:
			{
				csm.deleteAllCities();
				break;
			}
			case 7:
			{
				
				break loop;
			}

			default:
				break;
			}
			System.out.println("press any key to continue...");
			new Scanner(System.in).nextLine();
		}
	}
	}

