package com.psl.util;

public class SharedResource {

	private long cycles;
	
	public SharedResource(long cycles){
		this.cycles=cycles;
	}
	
	public synchronized void startCycles(){
		while(--cycles>0);
	}
	public synchronized long readCurrentValue(){
		return cycles;
	}
	
}
