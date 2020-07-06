package bit.camp.com.controller.main;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class UserController {

	@RequestMapping(value="/customer/needLogin.do")
	public ModelAndView needLogin() {
		ModelAndView mav=new ModelAndView("customer/loginWarning");
		mav.addObject("msg","로그인 후 이용해주세요");
		return mav;
	}
	@RequestMapping(value="/manager/needAdminLogin.do")
	public ModelAndView needAdminLogin() {
		ModelAndView mav=new ModelAndView("manager/adminLoginWarning");
		mav.addObject("msg","관리자외 이용이 불가합니다");
		return mav;
	}
}
