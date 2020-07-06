package com.bit.hello.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bit.hello.model.dto.Emp;
import com.bit.hello.model.service.EmpService;
import com.bit.hello.model.service.EmpServiceImpl;

@Controller
public class EmpLoginController {
	private final static Logger logger = 
		LoggerFactory.getLogger(EmpLoginController.class);
	
	EmpService service = new EmpServiceImpl();
	
	@RequestMapping("empAll")
	public String empAll(Model model) {
		model.addAttribute("empAll", service.empAll());
		
		return "emp/empAll";
	}
	
	
	
	@RequestMapping("login")
	//("login") 이라고 써도 알아서 밸류가 받아준다 get방식일경우 주로 이렇게 쓴다
	public String login() {
		return "emp/login";
	}
	
	@RequestMapping("loginX")
	//("login") 이라고 써도 알아서 밸류가 받아준다 get방식일경우 주로 이렇게 쓴다
	public String loginX() {
		return "emp/loginX";
	}

	@RequestMapping(value = "loginProcessX", method = RequestMethod.POST )
	//("login") 이라고 써도 알아서 밸류가 받아준다 get방식일경우 주로 이렇게 쓴다
	public String loginProcess(Model model, Emp emp) {
		logger.info(emp.toString());
		
		
		
		  //Emp emp = service.loginProcess(emp);
		  
		  if(emp == null ) { 
			  model.addAttribute("errorMsg", "사원번호 또는 이름을 확인하세요.");
		  return "emp/login"; 
		  } else { return "emp/welcome"; }
		 
		
		
	}
	




}

