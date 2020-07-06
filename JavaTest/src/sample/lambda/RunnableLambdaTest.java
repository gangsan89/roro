package sample.lambda;

public class RunnableLambdaTest {
	public static void main(String[] args) {
        Runnable runnable = () -> {
            for (char ch='A'; ch <= 'z'; ch++) {
                System.out.print(ch);
            }
        };
        Thread thread = new Thread(runnable);
        thread.start();
    }
}
