package sample.inner;

public class AAA외부클래스 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//AAA.xxx=9;
		//xxx=9;
		new AAA().xxx=9;
		//  AAA객체 자료형의 인스턴스에 의해서 xxx를 호출해서 9를 대입 
		// AAA객체 자료형의 인스턴스 를 재사용할 수 없다 . 9행이 끝나면 휘발성
		AAA  ref = new AAA();
		//AAA객체 자료형의 인스턴스 를 재사용하기 위해서 인스턴스의 주소를 기억시켜서
		// 언제 든지 AAA객체 자료형의 인스턴스를 호출할 수 있도록 대변자(ref)를 만들어 준것
		
		ref.xxx=9;
		ref.xxx=67856;
		System.out.println(ref.xxx);
        ref.methodAAAInner외부에있는메소드();
        ref.method();
        // AAAInner  접근을 하고 싶다.
        AAA.AAAInner inner=     ref.new AAAInner();
        //   클래스명 . static 멤버
        //   인스턴스 . non static 멤버
        //   인스턴스 .  static
        //   팩케이지 . 팩케이지 또는 클래스명 
        int a$b;
        
        inner.m();
       // ref.m();
        ref.new AAAInner() {// AAA.AAAInner의 sub class
        	@Override
        	public void m() {
        		System.out.println("익명 이너 클래스의 인스턴스");
        		System.out.println("super AAA.AAAInner의 m()와 다른 내용 구현");
        	}
        }.m();
        
        new Thread().start();
        new Thread(new Runnable() {
			public void run() {
				System.out.println("inline");
			}
		}).start();
        
        
        
       AAA.AAAInner aaInnerRef= ref.new AAAInner() {// AAA.AAAInner의 sub class
        	@Override
        	public void m() {
        		System.out.println("super AAA.AAAInner의 m()와 다른 내용 구현");
        	}
        };
        aaInnerRef.m();
        aaInnerRef.yyy=789;
        mmmmm(aaInnerRef);
	}
	public static void mmmmm(AAA.AAAInner p) {
		p.yyy=909090;
		p.m();
	}
}





