package bit.camp.com.controller.main;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import lombok.extern.log4j.Log4j;


@Controller
@Log4j
public class MainController {

	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index(Model model) {
		log.info("index");
		return "hotel/index";
	}
	@RequestMapping(value = "/about-us", method = RequestMethod.GET)
	public String about_us(Model model) {
		log.info("about_us");
		return "hotel/about-us";
	}
	@RequestMapping(value = "/payment", method = RequestMethod.GET)
	public String payment(Model model) {
		log.info("payment");
		return "hotel/payment";
	}
	@RequestMapping(value = "/rooms", method = RequestMethod.GET)
	public String rooms(Model model) {
		log.info("rooms");
		return "hotel/roomInformation";
	}
	
}
