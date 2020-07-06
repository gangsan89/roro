package com.book.page42;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class FooApp42 {
	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		Resource resource = new ClassPathResource("/config/page42Appcontext.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		Foo42 fooX = (Foo42)factory.getBean("bar42");
		fooX.doBar42();
	}
}
