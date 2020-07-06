package sample.lambda;
/*
 *  자바에서는 퍼블릭한 클래스가 Outter, Top 클래스로 인식을 한다
 *  아우터클래스, 탑클래스로 인식을 한다는건 Outter이름.java 파일이 된다는것
 *  
 *  만약 main() 가지는 클래스가 있으면 그 클래스를 Top클래스로 만들어버린다 (실행클래스로 만든다)
 *  대신 이 파일안에 public 한 클래스가 없어야 한다
 *  즉 main()가 위치한 자바 파일 안에 public 한 클래스가 없을 때 main() 를 내포하는 클래스가 public한 클래스로 인식한다
 */
class Pos{
	public static void main(String[] args) {
		System.out.println("실행");
	}
}
class Xy {

}
