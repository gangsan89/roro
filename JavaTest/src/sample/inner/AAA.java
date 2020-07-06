package sample.inner;
// instance 적인 멤버로 구성 
// AAA클래스의 인스턴스 로만 접근할 수 있는 멤베들로 구성
public class AAA {// Outter class , top class , public class
	public  int xxx;//field 변수
	public void method() {} //메소드 
	public  void methodAAAInner외부에있는메소드() {
		//AAAInner의 yyy값을 xxx에게 대입
		//xxx=yyy;
		xxx=new AAAInner().yyy;
		AAAInner ref = new AAAInner();
		xxx=ref.yyy;
		
	}
 	public class AAAInner{
		public int yyy=678;
		public void m() {
			System.out.println(xxx * yyy);
		}
	}
}






