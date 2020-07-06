package com.book.page42;

public class Foo42 {
	private Bar42 bar42;
	
	public void setBar42(Bar42 bar42) {
		this.bar42 = bar42;
		
	}
	
	public void doBar42() {
		Bar42 bar42 = getBar42();
		bar42.doIt();
	}
	
	protected Bar42 getBar42() {
		return null;
	}
}
