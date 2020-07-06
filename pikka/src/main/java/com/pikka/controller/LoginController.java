package com.pikka.controller;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pikka.domain.UserVO;
import com.pikka.service.LockerService;
import com.pikka.service.SeatService;
import com.pikka.service.UserService;
import com.pikka.validator.CustomValidator;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@Log4j
@AllArgsConstructor
@Controller
public class LoginController {
	
	private UserService userService;
	private CustomValidator customValidator;
	private LockerService lockerService;
	private SeatService seatService;
	
	@InitBinder
	public void InitBinder(WebDataBinder dataBinder) {
		dataBinder.addValidators(customValidator);
	}
	
	
	@RequestMapping(value = "/signUp", method = RequestMethod.POST)
	public String signUpProcess(@Validated UserVO vo, BindingResult result) {
		log.info(vo);
		if(result.hasErrors()) return "/pikka/SignUp";
		log.info("==== �쉶�썝媛��엯 �쑀�슚�꽦 寃��궗 �셿猷�====");
		if(userService.signUpUser(vo)) 	return "redirect:/";
			
		return "pikka/customLogin";
	}
	
	@RequestMapping(value = "/user/modify", method = RequestMethod.POST)
	public String modifyProcess(@Validated UserVO vo) {
		log.info(vo);
		userService.modifyUser(vo);
		return "redirect:/logout";
	}
	
	@RequestMapping(value = "/delete", method = RequestMethod.POST)
	public String deleteUser(String userId) {
		log.info(userId);
		seatService.delete(userId);
		userService.deleteUser(userId);
		return "redirect:/logout";
	}
	
//	@PostMapping("/delete")
//	public String deleteProcess(String userId) {
//		log.info("�궘�젣�븷 �쑀���쓽 ID : " + userId);
//		
//		
//		/* �씪而ㅼ꽌鍮꾩뒪 Nullpointer exception �삁�쇅泥섎━ �븘�슂
//		 * 
//		 * 
//		*/
//		/*
//		 * lockerService.updateLocState(new
//		 * Locker(lockerService.getTicket(userId).getLockerNo(),0));
//		 */
//		
//		log.info("�쑀�� �궘�젣 �뿬遺� : " + userService.deleteUser(userId));
//		return "redirect:/logout";
//	}
	
	// �븘�씠�뵒 以묐났 寃��궗
	@RequestMapping(method = RequestMethod.GET, value = "user/search", produces = {MediaType.APPLICATION_JSON_UTF8_VALUE})
	@ResponseBody
	public boolean searchProcess(@RequestParam("userId") String userId) {
		
		return userService.findUserById(userId);
	}
}
