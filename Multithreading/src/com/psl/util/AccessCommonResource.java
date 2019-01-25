package com.psl.util;

public class AccessCommonResource extends Thread {

private CommonResource commonResource;
	
	public AccessCommonResource(CommonResource commonResource){
		this.commonResource=commonResource;
	}
	
	
	@Override
	public void run(){
		
		try{
		commonResource.getLock();
		for(int i=0;i<commonResource.getSize();i++)
			System.out.println(commonResource.getNumber(i));
		
		commonResource.releaseLock();
		}catch(InterruptedException e){
			e.printStackTrace();
			
		}
	}
	

}
