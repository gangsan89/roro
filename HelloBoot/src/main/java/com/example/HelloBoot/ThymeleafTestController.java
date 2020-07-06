package com.example.HelloBoot;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ThymeleafTestController {
	
	@GetMapping("/hello")
	public String hello() {
		return"thymeleaf";
	}
	
	@GetMapping("/hello2")
	public String hello2(Model model) {
		model.addAttribute("userName", "gangsan");
		model.addAttribute("today", new Date());
		return"/thymeleaf";
	}
	
	/*
	 * @GetMapping("/hello3") public String hello3(Model model, Date date) {
	 * model.addAttribute("today", date.setDate(date)); return"/thymeleaf"; }
	 */
}
