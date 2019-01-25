package com.psl.client;

public class Client {

	public static void main(String[] args) {
		Thread t=Thread.currentThread();
		
		System.out.println(t);
		
		for(int i=1;i<=5;i++){
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		t.setName("my main thread");
		System.out.println(t);
	}
}
