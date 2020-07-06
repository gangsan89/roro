package use.page100;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.book.page100.GreetingService;



public class GreetingTest {
	public static void main(String[] args) {
		ApplicationContext ctx =
				new ClassPathXmlApplicationContext("config/page100AppContext.xml");
		GreetingService bean = (GreetingService)ctx.getBean("greetingTarget");
		bean.sayHello("김강산");
		bean.sayGoodbye("돈찌");
//		bean.goodbyeSay("로로");
		
//		GreetingService bean2 = (GreetingService)ctx.getBean("interceptorTest");
//		bean2.my_calc(4,0);
	}
}
