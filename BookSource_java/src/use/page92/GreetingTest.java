package use.page92;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.book.page92.GreetingService;


public class GreetingTest {
	public static void main(String[] args) {
		ApplicationContext ctx =
				new ClassPathXmlApplicationContext("config/page92AppContext.xml");
		GreetingService bean = (GreetingService)ctx.getBean("greeting");
		bean.sayHello("김강산");
		bean.sayHello("    ");
		bean.sayGoodbye("돈찌");
		bean.goodbyeSay("로로");
		
		GreetingService bean2 = (GreetingService)ctx.getBean("interceptorTest");
		bean2.my_calc(4,0);
	}
}
