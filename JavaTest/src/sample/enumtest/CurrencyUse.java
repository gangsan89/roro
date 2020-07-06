package sample.enumtest;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CurrencyUse {

	@SuppressWarnings({ "deprecation", "unused", "rawtypes" })
	public static void main(String[] args) {
		new Date(1900, 1, 1);
		List l = new ArrayList();
		
		Currency currency = Currency.PENNY;
		
		System.out.println(currency+" : "+ Currency.PENNY.value);
		
		for(Currency c  : Currency.values() ) {
			System.out.println(c +" : "+ Currency.valueOf(c) );
		}
		
	}
}
