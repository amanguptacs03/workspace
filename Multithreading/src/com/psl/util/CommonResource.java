package com.psl.util;

import java.util.Random;

public class CommonResource {

	private int numbers[];
	private boolean  available;
	private Random random;
	
	public CommonResource(){
		super();
		numbers=new int[50];
		available=true;
		random=new Random();
	}
	
	public synchronized void getLock() throws InterruptedException{                   //as "wait" always needed a synchronized method
		if(available==false)
	
				wait();  // we are calling it for commonResource------->and it is called by a 'thread'(i.e. it will block)
		
	}
	public synchronized  void releaseLock(){             //as "notifyAll" always needed a synchronized method
		available=true;
		notifyAll();
	}
	
	public int getSize(){
		return numbers.length;
	}
	
	public int generateNumber(){
		int num;
	do{
		num=random.nextInt();
	}while(num<0||num>0x3e8);
	return num;

	}
	
	public int getNumber(int index){
		return numbers[index];
	}
	
	public void setNumber(int index,int value){
		numbers[index]=value;
	}
	
}
