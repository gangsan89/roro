package com.book.page92;

public class GreetingServiceImpl implements GreetingService {
	private String greeting;

	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}
	
	@Override
	public void sayHello(String name) {
		System.out.println("sayHello: "+ greeting + ":"+name);
	}
	
	@Override
	public void sayGoodbye(String name) {
		System.out.println("sayGoodbye: "+ greeting + ":" + name);
	}

	@Override
	public void sayHello() {
		System.out.println("sayHello: "+ greeting + ":");
		
	}

	@Override
	public void goodbyeSay(String name) {
		System.out.println("goodbyeSay: "+ greeting + ":" + name);
		
	}

	@Override
	public void my_calc(int num1, int num2) {
		// TODO Auto-generated method stub
		System.out.println(num1+ "+" + num2 + "=" + (num1+num2));
		System.out.println(num1+ "-" + num2 + "=" + (num1-num2));
		System.out.println(num1+ "*" + num2 + "=" + (num1*num2));
		System.out.println(num1+ "/" + num2 + "=" + (num1/num2));
		System.out.println(num1+ "%" + num2 + "=" + (num1%num2));
	}
	
}
