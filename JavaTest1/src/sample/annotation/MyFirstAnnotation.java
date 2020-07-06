package sample.annotation;

public @interface MyFirstAnnotation {

	//Element 'name'
	public String name();
	
	//Element 'description', fefault value is ""
    public String description() default "";
}
