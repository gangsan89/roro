package sample.lambda;

public class PersonUse {
	public class 이름이있는Inner클래스 implements Say{
		 public int someting(int a, int b) {
				System.out.println("매개변수 number is "+a+","+b);
				return a+b;
		}
	}
	public void lambadaNoUse() {
		Say  say = new 이름이있는Inner클래스();
		Person rin = new Person();
		rin.hi(say);
	}
	public void lambadaNoUse1() {
		Say say= 
			new Say() {// 익명 inner 클래스의 인스턴스 생성문
			    public int someting(int a, int b) {
				System.out.println("#1");
				System.out.println("#2");
				System.out.println("매개변수 number is "+a+","+b);
				return 2020;
		    }
		};
		Person rin = new Person();
		rin.hi(say);
	}
	public void lambadaNoUse2() {
		Person rin = new Person();
		rin.hi(
				new Say() {// 익명 inner 클래스의 인스턴스 생성문 , 
					        // 재사용 불가 이유는 인스턴스를 참조하는 레퍼런스가 없어서
				    public int someting(int a, int b) {
					System.out.println("#1");
					System.out.println("#2");
					System.out.println("매개변수 number is "+a+","+b);
					return 2020;
			    }
			}	
		);
	}
	public void lambadaUse1() {
		Say say= 
				/*new Say() {// 익명 inner 클래스의 인스턴스 생성문
				    public int someting*/(int a, int b)-> {
					System.out.println("#1");
					System.out.println("#2");
					System.out.println("매개변수 number is "+a+","+b);
					return 2020;
			    }
			/*}*/;
			Person rin = new Person();
			rin.hi(say);
	}
	public void lambadaUse2() {
		Person rin = new Person();
		rin.hi(
				/*new Say() {// 익명 inner 클래스의 인스턴스 생성문 , 
					        // 재사용 불가 이유는 인스턴스를 참조하는 레퍼런스가 없어서
				    public int someting*/(int a, int b)-> {
					System.out.println("#1");
					System.out.println("#2");
					System.out.println("매개변수 number is "+a+","+b);
					return 2020;
			    }
			/*}*/	
		);
	}
	public void lambadaUse2_2() {
		Person rin = new Person();
		rin.hi(
				/*new Say() {// 익명 inner 클래스의 인스턴스 생성문 , 
					        // 재사용 불가 이유는 인스턴스를 참조하는 레퍼런스가 없어서
				    public int someting*/( a,  b)-> {
					System.out.println("#1");
					System.out.println("#2");
					System.out.println("매개변수 number is "+a+","+b);
					return 2020;
			    }
			/*}*/	
		);
	}
	
	public static void main(String[] args) {
		PersonUse new_PersonUse인스턴스참조자=new PersonUse();
		new_PersonUse인스턴스참조자.lambadaNoUse() ;
		System.out.println("/////");
		new_PersonUse인스턴스참조자.lambadaNoUse1() ;
		System.out.println("/////");
		new_PersonUse인스턴스참조자.lambadaNoUse2() ;
		System.out.println("/////");
		new_PersonUse인스턴스참조자.lambadaUse1() ;
		System.out.println("/////");
		new_PersonUse인스턴스참조자.lambadaUse2() ;
	}

}






