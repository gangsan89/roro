package use;


import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import dto.HelloBean;

public class HelloSpringApp {
	
	public static void main(String[] args) {
		Resource resource = new ClassPathResource("config/applicationContext.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		HelloBean bean = (HelloBean)factory.getBean("helloBean");
		bean.sayHello("Spring");
		
	}
}
