package com.book.page170;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.book.page170.dao.DeptDao;
import com.book.page170.domain.Dept;


public class Page170App {
	public static void main(String[] args) {
		Resource resource = new ClassPathResource("com/book/page170/config/page170MyBatisContext.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		DeptDao mapper = ( DeptDao ) factory.getBean("xxx");
		
		mapper.getDept(10);
		System.out.println(mapper);
		
		System.out.println("=============="); 
		for(Dept deptNo : mapper.getAllDepts() ) {
			System.out.println(mapper.getAllDepts()); 
		}
		
//		ProductMapper mapper = ( ProductMapper ) factory.getBean("xxx");
//		for(Product product : mapper.findProductList(105) ) {
//			System.out.println(product.getName()+", "+product.getPrice());
//		}
//		
//		  System.out.println("=============="); 
//		  for(Product product : mapper.findProductPrice(3000) ) {
//		  System.out.println(product.getName()+", "+product.getPrice()); }
		
	}
}
