package com.psl.main;

import java.sql.Date;

import com.psl.util.NumberContainer;
import com.psl.util.Stack;

public class Client {

	public static void main(String[] args) {
		Stack<String> s=new Stack<String>(10);
		Stack<Date> d=new Stack<Date>(5);
		
		s.push("today");
		s.push("is");
		s.push("tuesday");
		//s.push(new Date( ));
		
		
		System.out.println(s.peek());
		System.out.println(s.pop());
		
		//String v=(String)s.pop();   //ClassCastException----->solution is to used "GENERIC" (type safety)
		
		System.out.println(s.pop());
		
		NumberContainer<Double> dbl=new NumberContainer<Double>();
		NumberContainer<Long> lng=new NumberContainer<Long>();
		
		dbl.hasSameAverage(lng);
		
		
		String s1,s2;
		s1="hello";
		s2=s1;
		if(s1==s2){
			
		}

	}
}