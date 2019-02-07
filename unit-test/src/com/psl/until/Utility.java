package com.psl.until;

public class Utility {

	public long factorial(int number){
		long result=1;
		for(; number>0;number--)
			result *=number;
		return result;
	}
}
