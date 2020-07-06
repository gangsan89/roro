package page36;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import page36.x.y.Bar;
import page36.x.y.Baz;

public class Foo {
	private final static Logger logger = 
			LoggerFactory.getLogger(Foo.class);
			
	//page36.x.y.Bar bar = new page36.x.y.Bar();
	//page36.x.y.Baz baz = new page36.x.y.Baz();
	private Bar bar;
	private Baz baz;
	
	public Foo(Bar bar, Baz baz) {
		this.bar=bar;
		this.baz=baz;
		System.out.println("Foo(Bar bar, Baz baz)");
		logger.info("Foo(Bar bar, Baz baz)");
	}
	
}
