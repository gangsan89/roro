package com.book.page38;

public class GreetingServiceImpl implements GreetingService {
	
	private String greeting;
	private int loopCount;
	
	
	public GreetingServiceImpl(String greeting, int loopCount) {
		this.greeting=greeting;
		this.loopCount=loopCount;
		

	}
	
	@Override
	public void out() {
		for(int i=0; i<loopCount; i++){
			System.out.println(greeting);
		}
		
	}
	
	
}
