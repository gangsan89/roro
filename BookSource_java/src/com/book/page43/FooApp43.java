package com.book.page43;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class FooApp43 {
	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		Resource resource = new ClassPathResource("/config/page43Appcontext.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		Foo43 fooX = (Foo43)factory.getBean("foo43");
		System.out.println(fooX);
	}
}
