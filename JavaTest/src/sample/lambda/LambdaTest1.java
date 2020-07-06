package sample.lambda;

public class LambdaTest1 {
	
	public static void exec(Operator op) {
		int k = 10;
		int m = 20;
		int value = op.opFunc(k, m);
		System.out.println(value);
	}
	

}
