package com.my.bit.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.my.bit.model.service.EmpService;

@Controller
public class EmpController {
	
	@Autowired
	private EmpService empService;
	
	@RequestMapping(value = "emp/count.do", method = RequestMethod.GET)
	public String getEmpCount(Model model, HttpServletRequest request) {
		System.out.println("data");
		model.addAttribute("count", empService.getAllEmpCount());
		return "emp/count";
	}
	
	
}
