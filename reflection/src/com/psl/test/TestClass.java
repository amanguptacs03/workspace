package com.psl.test;

public class TestClass {

	@TestThis(name="this is the first test method")
	public void testMethod1(){
		
		System.out.println("test method 1");
	}
	
	@TestThis
	public void testMethod2(){
		System.out.println("test method 2");
	}
	
	
	@TestThis
	public void testMethod3(){
		System.out.println("test method 3");
	}
}
