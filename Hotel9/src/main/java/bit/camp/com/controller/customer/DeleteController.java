package bit.camp.com.controller.customer;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

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
public class DeleteController {
	
	@Autowired(required=false)
	private CustomerDao customerDao;
	
	
	//로그인
	@RequestMapping(value="delete")
	public String delete(Model model,Customer customer) {
	
		return "customer/delete";
	}
	
	@RequestMapping(value="deleteProcess", method=RequestMethod.POST)
	public void deleteProcess(Customer customer, HttpServletResponse response, HttpSession session) throws IOException {
		
		int ok = customerDao.deleteCustomer(customer);
		String text;
		String url;
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		if(ok!=0) {
			text="탈퇴되었습니다.";
			url="/index";
			session.invalidate();
		}else {
			text="입력된 정보를 찾을 수 없습니다, 다시 입력해주세요";
			url="delete";
		}
		out.println("<script>alert('"+text+"'); location.href='"+url+"';</script>");
		out.flush();
		out.close();
	}	
	
}
