package sample.enumtest;

public final class Currency {
	// Currency.PENNY
	public static final Currency PENNY;
	public static final Currency QUARTER;
	public static final Currency ENUMS$values[];
	static {
		PENNY = new Currency("PENNY", 1);
		QUARTER = new Currency("QUARTER", 25);
		ENUMS$values=( new Currency[] {PENNY, QUARTER});
	}
	
	
	/*
	 * private Currency() { name=""; value=0; }
	 */
	static public Currency[] values() {
		Currency temp[];
		int i;
		Currency temp2[];
		System.arraycopy(temp=ENUMS$values, 0, 
				temp2=new Currency[i=temp.length], 0, i);
		return temp2;
	}
	
	
	static public int valueOf(String name) {
		Currency[] cs= values();
		for( Currency c : cs ) {
			if(c.name.equals(name)) {
				return c.value;
			}
		}
		return 0;
	}
	
	private String name;
	private int value;
	private Currency(String name, int value) {
		this.name = name;
		this.value = value;
	}

	@Override
	public String toString() {
		return "Currency [name=" + name + ", value=" + value + "]";
	}
	
}
