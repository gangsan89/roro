package com.exam.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.exam.demo.dao.vo.UserDao;

@Controller
public class MybatisTestController {
	@Autowired
	UserDao userDao;
	
	@GetMapping("userAll")
	public void userAll(Model model) {
		
		model.addAttribute("userList", userDao.selectAll());
		
	}
}
