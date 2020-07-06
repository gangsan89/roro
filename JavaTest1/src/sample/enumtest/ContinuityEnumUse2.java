package sample.enumtest;

import java.util.Date;

public class ContinuityEnumUse2 {
	public static void main(String[] args) {
		System.out.println(USACoins2.QUARTER);
		System.out.println(USACoins2.QUARTER.value());
		//USACoins2.QUARTER.value=45;
		//System.out.println(USACoins2.QUARTER.value);
		
		String q = USACoins2.QUARTER.toString();
		System.out.println(q);
		
		A a= new A();
		B b= new B();
		System.out.println(a);
		System.out.println(a.toString());
		System.out.println(b);
		String aStr= a.toString();
		//String bStr.a;
		
	}
}
