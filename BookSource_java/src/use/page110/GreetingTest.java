package use.page110;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.book.page110.GreetingService;

public class GreetingTest {
	public static void main(String[] args) {
		ApplicationContext ctx =
				new ClassPathXmlApplicationContext("config/page110AppContext.xml");
		System.out.println("getBean 전");
		GreetingService bean = (GreetingService)ctx.getBean("greetingTarget");
		System.out.println("getBean 후");
		bean.sayHello("김강산");
		System.out.println("getBean 김강산");
		bean.sayGoodbye("돈찌");
	}
}
