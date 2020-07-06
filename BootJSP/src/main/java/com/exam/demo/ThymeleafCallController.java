package com.exam.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ThymeleafCallController {
	
	@GetMapping("/helloth")
	public String hello(Model model) {
		List<String> list = new ArrayList<>();
		list.add("kim");
		list.add("lee");
		list.add("dong");
		model.addAttribute("list", list);
		return "th/hello";
	}
}
