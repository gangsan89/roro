package com.exam.demo;

import java.util.Date;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReLoadTestController {
	
	@GetMapping("/re")
	public String reload() {
		
		return "kim"+ new Date();
	}
}
