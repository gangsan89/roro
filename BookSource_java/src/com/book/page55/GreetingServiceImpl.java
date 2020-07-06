package com.book.page55;

public class GreetingServiceImpl implements GreetingService {
	private String msg;
	
	public GreetingServiceImpl() {
		System.out.println("GreetingServiceImpl()");
	}
	
	@Override
	public void setGreeting(String msg) {
		this.msg=msg;
		System.out.println("setGreeting(String msg)");
	}

	@Override
	public String toString() {
		return "GreetingServiceImpl [msg=" + msg + "]";
	}

	
}
