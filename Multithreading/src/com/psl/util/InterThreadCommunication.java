package com.psl.util;

public class InterThreadCommunication {

	public static void main(String[] args) throws InterruptedException {
		
		CommonResource commonResource;
		commonResource=new CommonResource();
		
		
		
		
		new UpdateCommonResource(commonResource).start();
		
		Thread.sleep(1000);
		
		new AccessCommonResource(commonResource).start();
	}
}
