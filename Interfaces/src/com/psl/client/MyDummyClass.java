package com.psl.client;

public class MyDummyClass {
	public static int variable=100; //inline initialization
	//can be access by the class name
	
	static{
		//static initialization block
		
	}
	private float marks;
	
	public static int getVariable(){
		return variable;
	//	marks= 899;----->will give CTE......
	}
}
