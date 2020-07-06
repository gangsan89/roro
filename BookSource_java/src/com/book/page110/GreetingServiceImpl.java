package com.book.page110;

public class GreetingServiceImpl implements GreetingService {
	private String greeting;

	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}

	@Override
	public void sayHello(String name) {
		System.out.println("Hello: "+ greeting + ":"+name);
		
	}

	@Override
	public void sayGoodbye(String name) {
		System.out.println("Goodbye: "+ greeting + ":"+name);
		
	}
	
	
}
