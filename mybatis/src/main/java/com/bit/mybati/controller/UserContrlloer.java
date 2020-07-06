package com.bit.mybati.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.bit.mybati.model.domain.User;

@Controller
public class UserContrlloer {
	
	@GetMapping("/signUp")
	public void signUp() {}
	
	
	/* 값을 조작하지 않고 바로 전달해주는 거면 생략가능  
	 * 이유 : @ModelAttribute가 생략되있음   ex.) ↓ @ModelAttribute User user*/
	@GetMapping("/getDataSignUpdata")
	public String getUserSignUp(Model model,User user) {
		return "info";
	}
	
	@PostMapping("/postDataSignUpData")
	public String PostUserSignUp(Model model, User user) {
		return "info";
	}
}
