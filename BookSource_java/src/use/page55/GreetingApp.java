package use.page55;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.book.page55.GreetingService;;

public class GreetingApp {
	
	public static void main(String[] args) {
		Resource resource = new ClassPathResource("config/page55AppContext.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		System.out.println("main() getBean(\"greeting\" 호출 전");
		GreetingService service =
				(GreetingService)factory.getBean("greeting");
		GreetingService service2 =
				(GreetingService)factory.getBean("greeting");
		System.out.println("main() getBean(\"greeting\" 호출 후"+service);
		System.out.println("main() getBean(\"greeting\" 호출 후"+service2);
		System.out.println(service==service2);
		
	}
	
}
