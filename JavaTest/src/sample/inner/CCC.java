package sample.inner;

public class CCC {
	private  int x=123;
	public void init() {
		//ms();
		DDD.ms();
	}
	static public class DDD{
		public static void ms() {
			System.out.println("ms"+x);
		}
	}
}
