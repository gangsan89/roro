package com.bit.mybati.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.bit.mybati.model.service.EmpService;

import lombok.extern.log4j.Log4j;

@Controller
@Log4j
public class EmpController {
	@Autowired
	EmpService empService;
	
	@GetMapping("/")
	public String getIndex(Model model) {
		return "index";
	}
	
	@GetMapping("/empAll")
	public String getEmpALl(Model model, String data) {
		log.info("request없이 데이터 받아오기 : "+data);
		log.info(empService.getAllEmpNo());
		model.addAttribute("emp", empService.getAllEmps());
		
		return "empAll";
	}
	
}
