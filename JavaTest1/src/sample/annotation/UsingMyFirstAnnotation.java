package sample.annotation;

@MyFirstAnnotation(name="Some name", description="Some description")
public class UsingMyFirstAnnotation {
	
	@MyFirstAnnotation(name="John", description="Write by John")
	public UsingMyFirstAnnotation() {
		
	}
	@MyFirstAnnotation(name="Tom")
	public void someMethod() {
		
	}
	
	//An Annotation is annotated on parameter of method
	public void todo(@MyFirstAnnotation(name="none")String job) {
		// An annotation is anntated on local variable
		@MyFirstAnnotation(name="Some name")
		int localVariable=0;
	}
}
