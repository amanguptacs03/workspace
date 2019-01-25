package com.psl.util;

public class MyRunnable implements Runnable{

	@Override
	public void run() {
		for(int i=1;i<=5;i++){
			System.out.println(String.format("%d %s", i,Thread.currentThread().getName()));
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
		
	}

}
