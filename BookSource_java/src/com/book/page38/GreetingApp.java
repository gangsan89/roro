package com.book.page38;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;


public class GreetingApp {
	
	public static void main(String[] args) {
		Resource resource = new ClassPathResource("config/page38AppContext.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		GreetingService service =
				(GreetingService)factory.getBean("greeting1");
		service.out();
	
	}
	
}
