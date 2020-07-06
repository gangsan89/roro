package com.exam.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class JSPCallController {
	
	@GetMapping("/hello")
	public String hello(Model model) {
		List<String> list = new ArrayList<>();
		list.add("kim");
		list.add("lee");
		list.add("dong");
		model.addAttribute("list", list);
		return "hello";
	}
}
