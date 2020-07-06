package sample.enumtest;

public class CurrencyUse {
	public static void main(String[] args) {
		Currency currency = Currency.PENNY;
		
		System.out.println(currency+" : "+ Currency.PENNY.values());
		
		for(Currency c : currency.values() ) {
			System.out.println(c+ " : " + currency.PENNY.values());
		}
	}
}
