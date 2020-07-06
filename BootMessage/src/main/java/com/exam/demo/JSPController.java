package com.exam.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class JSPController {
	
	@GetMapping("/jsp")
	public String index() {
		
		return "hellow";
	}
}
