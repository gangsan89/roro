package sample.annotation;

public class UseInsert {
	public static void main(String[] args) {
		AnnotationUse1 exam01 = new AnnotationUse1();
		InsertDataAnnotationHandler.process(exam01);
		
		AnnotationUse2 exam02 = new AnnotationUse2();
		InsertDataAnnotationHandler.process(exam02);
		
		System.out.println(exam01);
		System.out.println(exam02);
		
	}
}
