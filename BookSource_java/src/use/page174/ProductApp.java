package use.page174;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.book.page174.Product;
import com.book.page174.dao.ProductMapper;


public class ProductApp {
	public static void main(String[] args) {
		Resource resource = new ClassPathResource("config/page174MyBatisContext.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		ProductMapper mapper = ( ProductMapper ) factory.getBean("xxx");
		for(Product product : mapper.findProductList(105) ) {
			System.out.println(product.getName()+", "+product.getPrice());
		}
		
		  System.out.println("=============="); 
		  for(Product product : mapper.findProductPrice(3000) ) {
		  System.out.println(product.getName()+", "+product.getPrice()); }
		 
//		Product product = mapper.findProduct(101);
//		System.out.println(product);
		
	}
}
