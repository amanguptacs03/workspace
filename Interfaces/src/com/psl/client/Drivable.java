package com.psl.client;

public interface Drivable {
	
	int variable=100;// bydefault it is "public static final"
	//public void accelerate();

	public default void accelerate(){ 
		// feature from java 8---> DEFAULT METHOD
		//from there ,is no need to override the method in the class that will implement this(OPTIONAL)
	}
	public void steer();
}
