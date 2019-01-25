package com.psl.client;

import com.psl.util.AccessSharedResource;
import com.psl.util.SharedResource;
import com.psl.util.UpdateSharedResource;

public class SynchronizationDemo {

	public static void main(String[] args) {
		
		SharedResource sharedResource;
		sharedResource =new SharedResource(100_000_1000_000L);
		
		
		new UpdateSharedResource(sharedResource).start();
	
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		new AccessSharedResource(sharedResource).start();
	}
}
