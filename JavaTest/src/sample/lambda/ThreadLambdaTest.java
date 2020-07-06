package sample.lambda;

public class ThreadLambdaTest {
	public static void main(String[] args) {
		Thread thread1 = new MyThread();
		thread1.start();
		//////////////////////////////////
		
		Thread thread2 = new Thread(){
			public void run() {
				System.out.println("Hello World!!#1");
			}
		};
		thread2.start();
		//////////////////////////////////
		
		new Thread(()->{
			System.out.println("Hello World!!#2");
		}).start();
		
	}
}
class MyThread extends Thread {
	public void run() {
		System.out.println("Hello World!!#3");
	}
}
