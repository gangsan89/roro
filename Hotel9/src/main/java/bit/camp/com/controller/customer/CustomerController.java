package bit.camp.com.controller.customer;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import bit.camp.com.model.VO.mybatis.Customer;
import bit.camp.com.model.VO.mybatis.Reservation;
import bit.camp.com.model.service.customer.CustomerService;

@Controller
public class CustomerController {

	private static final Logger log = LogManager.getLogger(CustomerController.class);

	@Autowired
	private CustomerService customerService;

	// 마이페이지
	@RequestMapping("/myPage")
	public String myPageView(Model model, HttpServletRequest request) {

		log.debug("/myPage");
		HttpSession session = request.getSession();
		String id = (String) session.getAttribute("customerID");
		System.out.println(id);
		model.addAttribute("customer", customerService.customerMypageView(id));

		System.out.println(session);

		return "/customer/myPage";
	}

	// 개인정보 수정하기
	// 수정 전 화면에 회원정보를 보여준다
	@RequestMapping(value = "/customerModify", method = RequestMethod.GET)
	public String customerModifyUpdateA(Model model, HttpServletRequest request) {

		HttpSession session = request.getSession();
		String customerID = (String) session.getAttribute("customerID");
		// Customer cust = customerService.customerMypageView(customerID);
		model.addAttribute("customer", customerService.customerMypageView(customerID));
		return "/customer/customerModify";

	}

	// 정보 수정
	@RequestMapping(value = "/customerModify", method = RequestMethod.POST)
	public String customerModifyUpdateB(Customer customerVo, HttpSession session, RedirectAttributes reAtt)
			throws Exception {

		customerService.customerModify(customerVo);
		reAtt.addFlashAttribute("msg", "회원정보 수정 완료");
		System.out.println(customerVo);

		session.invalidate();

		return "redirect:/login";

	}

	// 예약정보 확인
	@RequestMapping(value = "/reservationConfirm", method = RequestMethod.GET)
	public String reservationView(Model model, HttpServletRequest request) {
		
		System.out.println("확인");

		HttpSession session = request.getSession();
		String id = (String) session.getAttribute("customerID");

		List<Reservation> cust = (List<Reservation>) customerService.customerReservation(id);

		model.addAttribute("customerList", cust);

		System.out.println(cust);
		return "/customer/reservationConfirm";

	}

}