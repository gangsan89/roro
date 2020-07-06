package sample.lambda;

public class LambdaTest1Use {
	static Operator op = new Operator() {
		public int opFunc(int i, int j){
			return i + j;
		}
	};
	public static void main(String[] args) {
		LambdaTest1 test1 = new LambdaTest1();
		test1.exec( //람다사용
			(i,j)->{
				return i + j;
			}
		);
		//람다를 사용하지 않는 구문 #1 ==> 래퍼런스 X, 익명 inner클래스
		//LambdaTest1의 exec()의 parameter가 원하는것?
		//exec(Operator op) exec()의 매개변수로 Operator op로 되어있다는것은
		//Operator의 인스턴스를 op가 참조하겠다는 것
		// exec ( new Operator() ) ==> 하면 되는데
		// Operator 는 추상적인 클래스이므로 인스턴스를 만들 수 없느는것이 문제
		// 해결방법 1. Operator 을 implements 구현 시켜준 sub클래스를 만들어서
		// 그 서브클래스의 인스턴스가 오면 된다
		/* 고민할점 : 
		 * 1. 이름을 갖는 클래스를 만들어 줄것인지
		 * 1-1. outter? 로 만들건지
		 * 1-2 inner ? 로 만들건지
		 * 2. 익명으로 만들거라면 ==> 당첨
		 * 2-1 어디서 만들건지
		 * 2-1-1 멤버변수 위치
		 * 2-1-2 메소드 안에서 로컬로 ==> 당첨
		 * 2-2 재사용할건지
		 * 2-3 재사용 안할건지 ==> 당첨
		 */
		test1.exec( //람다사용 x
			op
		);//exec() end
		LambdaTest1 test2 = new LambdaTest1();
		test2.exec( //람다사용 x
				new Operator() {
					public int opFunc(int i, int j){
						return i - j;
					}
				}
		);//exec() end
		
	}//main end
}//class end
