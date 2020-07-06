package sample.lambda;

public class LambdaTest1Use2 {
	public static void main(String[] args) {
		
		Operator op = (int a, int b)-> { return 0; };
		LambdaTest1 test1 = new LambdaTest1();
		test1.exec(op);
		
	}//main end
}//class end
