package com.psl.client;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Client {

	public static void main(String[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, InstantiationException {
		
		BankAccount account=new BankAccount("warren buffet", "34323", 2341.52);
		
		
	Class<?> cls=	account.getClass();
	Class<?> cl=BankAccount.class; // this will also give you the class object
	cls.newInstance();  //create new object of the bankAccount class
	
for(Field f:	cls.getDeclaredFields()){
	
	System.out.println(f.getType());
	System.out.println(f.getName());
}
System.out.println("=================================");

for(Method m :cls.getDeclaredMethods()){
	System.out.println(m.getName());
	
	System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	
	if(m.getName().contains("get")){
		
		System.out.println(m.invoke(account));
	}
}
		
	}
}
