package sample.enumtest;

public enum USACoins2 {
	PENNY(1), NICKLE(5), DIME(10), QUARTER(25);
	
	private final int value;
	private USACoins2(int i) {
		value=i;
	}
	public int value() {
		return value;
	}
}
