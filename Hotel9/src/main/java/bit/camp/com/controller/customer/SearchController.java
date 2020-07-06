package bit.camp.com.controller.customer;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import bit.camp.com.model.VO.mybatis.Customer;
import bit.camp.com.model.dao.CustomerDao;
import lombok.extern.log4j.Log4j;

@Controller
@Log4j
public class SearchController {

	@Autowired(required = false)
	private CustomerDao customerDao;
	String url;
	String text;

	@RequestMapping(value = "/searchID")
	public String searchID(Model model, Customer customer) {
		return "customer/searchID";
	}// searchId

	@RequestMapping(value = "/searchIDProcess", method = RequestMethod.POST)
	public void searchIDProcess(Model model, Customer customer, HttpServletResponse response) throws IOException {
		String customerID = customerDao.searchID(customer);
		model.addAttribute("customer", customerID);
		log.info(customerID);

		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		if (customerID != null) {
			text = "아이디: " + customerID;
			url = "login";
		} else {
			text = "입력된 정보를 찾을 수 없습니다, 다시 입력해주세요";
			url = "searchID";
		}
		out.println("<script>alert('" + text + "'); location.href='" + url + "';</script>");
		out.flush();
		out.close();
	}// searchId

//////////////////////////////////////////////////////////////////////

	@RequestMapping(value = "/searchPW")
	public String searchPW(Model model, Customer customer) {

		return "customer/searchPW";
	}// searchPw

	@RequestMapping(value = "/searchPWProcess", method = RequestMethod.POST)
	public void searchPWProcess(Model model, Customer customer, HttpServletResponse response) throws IOException {
		String customerPW = customerDao.searchPW(customer);
		model.addAttribute("customer", customerPW);
		log.info(customerPW);

		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		if (customerPW != null) {
			text = "비밀번호: " + customerPW;
			url = "login";
		} else {
			text = "입력된 정보를 찾을 수 없습니다, 다시 입력해주세요";
			url = "searchPW";
		}
		out.println("<script>alert('" + text + "'); location.href='" + url + "';</script>");
		out.flush();
		out.close();
	}// searchPw
}
