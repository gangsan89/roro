package page36.x.y;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Baz {
	private final static Logger logger = 
			LoggerFactory.getLogger(Baz.class);
	public Baz() {
		System.out.println("Baz()");
		logger.info("Baz()");
	}
}
