package com.psl.util;

public class UpdateCommonResource extends Thread{

	private CommonResource commonResource;
	
	public UpdateCommonResource(CommonResource commonResource){
		this.commonResource=commonResource;
	}
	
	
	@Override
	public void run(){
		try{
			commonResource.getLock();
			for(int i=0;i<commonResource.getSize();i++)
				commonResource.setNumber(i, commonResource.generateNumber());
			
			commonResource.releaseLock();
			}catch(InterruptedException e){
				e.printStackTrace();
				
			}
	}
}
