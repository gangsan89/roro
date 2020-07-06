package page36;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;


public class FooApp {
	public static void main(String[] args) {
		Resource resource = new ClassPathResource("config/page36AppContext.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		Foo fooX = (Foo)factory.getBean("foo");
		
		
	}
}
