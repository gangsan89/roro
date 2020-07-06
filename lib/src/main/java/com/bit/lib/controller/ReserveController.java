package com.bit.lib.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bit.lib.service.BookDetailService;
import com.bit.lib.service.ReserveService;

@Controller
public class ReserveController {

	@Autowired
	private ReserveService reserveService;
	
	@Autowired
	private BookDetailService bookDetailService;

	// 도서 예약

	@RequestMapping(value = "/reserve.do", method=RequestMethod.POST)
	@ResponseBody
	public void insertReserve(@RequestParam List<String> chknos, HttpSession session) {
		String id = (String) session.getAttribute("id");
		System.out.println(id);
		System.out.println(chknos+"예약"+id);
		reserveService.insertReserve(id, chknos);
		System.out.println("insert Ok");
		reserveService.insertReserveup(chknos);

		System.out.println("reserve ok");

	}

	// 도서 예약 목록
	@RequestMapping(value = "/reserveList.do", method=RequestMethod.GET)
	public String getReserveList(Model model, HttpSession session) {
		String id = (String) session.getAttribute("id");

		model.addAttribute("rentst", reserveService.getReserveList(id));
		model.addAttribute("history", bookDetailService.rentCount(id)); 
		System.out.println("hitorycount Ok");

		System.out.println(reserveService.getReserveList(id));
		 System.out.println(bookDetailService.rentCount(id)); 

		return "mypage/reserve/reserveList";
	}

	 //도서 예약 취소

	@RequestMapping(value = "/reserveCancel1.do", method = RequestMethod.POST)
	@ResponseBody
	public void reserveCancel1(@RequestParam String bookNo) {
		System.out.println(bookNo);

		reserveService.reserveCancel(bookNo);
		reserveService.reserveCancelup(bookNo);

		System.out.println("reserveCancel Ok");
	}

}