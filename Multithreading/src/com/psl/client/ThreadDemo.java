package com.psl.client;

import com.psl.util.MyRunnable;
import com.psl.util.MyThread;

public class ThreadDemo {

	public static void main(String[] args) {
		MyThread t1=new MyThread("first");
		MyThread t2=new MyThread("second");
		MyThread t3=new MyThread("third");
		
		t1.start();
		t2.start();
		t3.start();
		
		try {
			t1.join();                  //join------>{called by "a" thread}main                 {"on a" thread}t1,t2,t3...........
			t2.join();
			t3.join();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	
		
		MyRunnable r1=new MyRunnable();   //act as a independent task
		MyRunnable r2=new MyRunnable();
		MyRunnable r3=new MyRunnable();
		
		Thread rt1=new Thread(r1, "fourth");
		Thread rt2=new Thread(r2, "fifth");
		Thread rt3=new Thread(r3, "sixth");
		
		rt1.start();
		rt2.start();
		rt3.start();
	}
}
