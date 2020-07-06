package page36.x.y;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Bar {
	private final static Logger logger = 
			LoggerFactory.getLogger(Bar.class);
	public Bar() {
		System.out.println("Bar()");
		logger.info("Bar()");
	}
}
