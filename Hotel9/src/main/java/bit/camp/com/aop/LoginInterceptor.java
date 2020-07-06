package bit.camp.com.aop;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.WebContentInterceptor;

public class LoginInterceptor extends WebContentInterceptor {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws ServletException {
		
		try {
		if(request.getSession().getAttribute("customerID")==null) {
			
				response.sendRedirect(request.getContextPath()+"/customer/needLogin.do");
				return false;
				
			} else {
				return true;
			}}catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		return super.preHandle(request, response, handler);
	}
	
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		super.postHandle(request, response, handler, modelAndView);
	}

}