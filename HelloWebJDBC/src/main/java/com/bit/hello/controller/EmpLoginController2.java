package com.bit.hello.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bit.hello.model.dto.Emp;
import com.bit.hello.model.service.EmpService;
import com.bit.hello.model.service.EmpServiceImpl;

@Controller
public class EmpLoginController2 {
	private final static Logger logger = 
		LoggerFactory.getLogger(EmpLoginController2.class);
	
	@Autowired
	private EmpService empService;
	
	@RequestMapping("login2")
	//("login") 이라고 써도 알아서 밸류가 받아준다 get방식일경우 주로 이렇게 쓴다
	public String login2() {
		
		return "emp/login2";
	}

	@RequestMapping(value = "loginProcess2", method = RequestMethod.POST )
	//("login") 이라고 써도 알아서 밸류가 받아준다 get방식일경우 주로 이렇게 쓴다
	public String loginProcess2( Model model, int empNo, String eName) {
		logger.info(empNo+","+eName);
		
		
		Emp emp = empService.loginProcess(empNo, eName);
		
		if(emp == null ) {
			model.addAttribute("errorMsg", "사원번호 또는 이름을 확인하세요.");
			return "emp/login2";
		} else {
			return "emp/welcome";
		}
		
		
	}




}

