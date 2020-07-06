package com.exam.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class InProcController {
	
	@GetMapping("/")
	public String index() {
		
		return "userInput";
	}
	
	@GetMapping("/userInput")
	public ModelAndView start(@ModelAttribute  UserVO userVO) {
		
		return new ModelAndView("th/userInput");
	}
	
//	@GetMapping("/userInput2")
//	public String start2(Model model) {
//		model.addAttribute("UserVO", new UserVO());
//		return "th/userInput";
//	}
	
	@PostMapping("/inProc")
	public String inProc(Model model, UserVO userVO) {
		System.out.println(userVO);
		model.addAttribute("userVO", userVO);
		return "th/userOutput";
	}
	
	@PostMapping("/userList")
	public void userList(Model model) {
		List<UserVO> userList = new ArrayList<UserVO>();
		userList.add(new UserVO("123", "민종", "NIKE F.C",true));
		userList.add(new UserVO("456", "민종", "NIKC F.C",false));
		userList.add(new UserVO("789", "민종", "NIKEE F.C",true));
		model.addAttribute("userList", userList);
	}
	
}
