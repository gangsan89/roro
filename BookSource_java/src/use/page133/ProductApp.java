package use.page133;

import java.util.List;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.book.page133.Product;
import com.book.page133.ProductDAO;

public class ProductApp {
	public static void main(String[] args) {
		Resource resource = new ClassPathResource("config/page133JDBCContext.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		
		ProductDAO dao = (ProductDAO)factory.getBean("productDao2");
		
		List<Product> products = dao.findProductList();
		for(Product p: products) {
			System.out.println(p);
		}
		
	}
}
