package com.example.bootEmp.controller;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.bootEmp.model.dao.EmpDAO;
import com.example.bootEmp.model.dao.EmpDAOImpl;
import com.example.bootEmp.model.dao.JpaRepositoryTest;
import com.example.bootEmp.model.dao.UserDAO;
import com.example.bootEmp.model.domain.Emp;
import com.example.bootEmp.model.domain.User;

import lombok.extern.log4j.Log4j2;


@Controller
@Log4j2
public class EmpController {
	
//	@Autowired
//	private JpaRepositoryTest jpa;
	
	@Autowired
	EmpDAOImpl empDAOImpl;
	@Autowired
	EmpDAO empDAO;

	@GetMapping("/")
	public String index(Model model, Emp empNo, EmpDAOImpl empList) {
		System.out.println(empDAOImpl.selectAll(empNo));
		System.out.println(empList);
		model.addAttribute("db", empDAOImpl.selectAll(empNo));
		System.out.println("모델 : "+model.getAttribute("db"));
		return "index";
	}
	
	@GetMapping("/empNo")
	public String empNo(Model model, Emp empNo) {
		System.out.println(empDAO.empNo(empNo));
		model.addAttribute("db", empDAO.empNo(empNo));
		System.out.println("모델 : "+model.getAttribute("db"));
		return "index";
	}
	
	@PostMapping("/welcomeEmp")
	public void welcome(Model model, Emp emp) {
		//model.addAttribute("userList", dao.selectAll());
		log.info(emp);
	}
	
//	@GetMapping("/empAll")
//	public String all(Model model, Emp emp) {
//		System.out.println(empDAO.selectAll(emp));
//		//System.out.println(jpa.findAll());
//		
//		model.addAttribute("db", empDAO.selectAll(emp));
//		return "index";
//	}
	
	/*
	 * @GetMapping("/userAll") public String userAll(Model model, User user) {
	 * System.out.println(empDAO.selectAll()); System.out.println(jpa.findAll());
	 * 
	 * model.addAttribute("db", empDAO.userSearch(null)); return "index"; }
	 * 
	 * @GetMapping("/userName") public List<User> nameSearch(Model model, User user,
	 * String user_name) { List<User> list = empDAO.nameSearch(user_name);
	 * model.addAttribute("db",list); return list;
	 * 
	 * }
	 */
	

	/*
	 * @GetMapping("/aauserName") public String nameSearch(Model model, User user,
	 * String user_name){ //List<User> list = userDAO.nameSearch(user_name); int
	 * userId= 1; //model.addAttribute("db",list); return "index";
	 * 
	 * }
	 */
	
	
}
