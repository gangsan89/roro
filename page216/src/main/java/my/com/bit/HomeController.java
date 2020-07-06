package my.com.bit;

import java.io.IOException;
import java.io.InputStream;
import java.lang.ProcessBuilder.Redirect;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@RequestMapping("re")
	public String redirectTest() {
		logger.info("redirectTest()");
		return "redirect:/";//이렇게하면 sendredirect 랑 똑같고
		//return "/"; 이렇게 하면 포워드랑 똑같다
	}
	
	
	@RequestMapping("go")
	public String go(@RequestParam("age") int age2) {
		logger.info("매개변수 : "+ age2);
		return "home";
	}
	
	@RequestMapping("go2")
	public String go2(int age) {
		logger.info("매개변수 : "+ age);
		return "home";
	}
	
	@RequestMapping("go3")
	public String go3(@RequestParam(value = "age", defaultValue = "10") String age) {
		logger.info("매개변수 : "+ age);
		return "home";
	}
	
	@RequestMapping("home.do")
	public void home2() {
		logger.info("home()");
	}
	/**
	 *  call : 메소드명으로 ==> home
	 *  return void ==> 메소드를 호출한 home 이름으로 호출이 도니다
	 */
	@RequestMapping
	public void home() {
		logger.info("===home()");
	}
	
	
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model, InputStream in, HttpServletRequest request) {
		logger.info("Welcome home! The client locale is {}.", locale);
		Locale locale2 = new Locale("ko", "KR");
		System.out.println(Locale.getDefault());
		
		try {
			InputStream in2 = request.getInputStream();
			InputStream in3= System.in;
			System.out.println(in==in2);
			System.out.println(in==in3);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	
}
