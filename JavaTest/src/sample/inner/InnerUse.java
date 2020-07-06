package sample.inner;

public class InnerUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outter.StaticInner inner1 = new Outter.StaticInner();
		Outter.StaticInner.a =7;
		//Outter.StaticInner.m();
		inner1.m();
	}

}






