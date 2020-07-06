package com.example.bootEmp.controller;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.bootEmp.model.dao.JpaRepositoryTest;
import com.example.bootEmp.model.dao.UserDAO;
import com.example.bootEmp.model.domain.Emp;
import com.example.bootEmp.model.domain.User;

import lombok.extern.log4j.Log4j2;


@RestController
@Log4j2
public class UserController {
	
//	@Autowired
//	private JpaRepositoryTest jpa;
//	
//	@Autowired
//	UserDAO userDAO;
//
//	
//	@GetMapping("/index")
//	public String index(Model model, User user) {
//		//System.out.println(userDAO.userSearch("123"));
//		System.out.println(userDAO.selectAll());
//		System.out.println(jpa.findAll());
//		
//		model.addAttribute("db", userDAO.selectAll());
//		return "index";
//	}
//	
//	@PostMapping("/welcome")
//	public void welcome(Model model,User user) {
//		//model.addAttribute("userList", dao.selectAll());
//		log.info(user);
//	}
//	
//	@GetMapping("/all")
//	public String all(Model model, User user) {
//		System.out.println(userDAO.selectAll());
//		System.out.println(jpa.findAll());
//		
//		model.addAttribute("db", userDAO.selectAll());
//		return "index";
//	}
//	
//	@GetMapping("/userAll")
//	public String userAll(Model model, User user) {
//		System.out.println(userDAO.selectAll());
//		System.out.println(jpa.findAll());
//		
//		model.addAttribute("db", userDAO.userSearch(null));
//		return "index";
//	}
//	
//	@GetMapping("/userName")
//	public List<User> nameSearch(Model model, User user, String user_name) {
//		List<User> list = userDAO.nameSearch(user_name);
//		model.addAttribute("db",list);
//		return list;
//		
//	}
//	
//
//	/*
//	 * @GetMapping("/aauserName") public String nameSearch(Model model, User user,
//	 * String user_name){ //List<User> list = userDAO.nameSearch(user_name); int
//	 * userId= 1; //model.addAttribute("db",list); return "index";
//	 * 
//	 * }
//	 */
	
	
}
