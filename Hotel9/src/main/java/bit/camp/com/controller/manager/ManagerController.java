package bit.camp.com.controller.manager;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import bit.camp.com.model.VO.mybatis.Manager;
import bit.camp.com.model.VO.mybatis.Room;
import bit.camp.com.model.VO.mybatis.RoomMngDTO;
import bit.camp.com.model.VO.mybatis.RsrvlistDTO;
import bit.camp.com.model.dao.ManagerDao;
import bit.camp.com.model.service.manager.ManagerService;
import lombok.extern.log4j.Log4j;

@Controller
@Log4j
public class ManagerController {
	
	@Autowired
	private ManagerService managerService;
	@Autowired
	private ManagerDao managerDao;
	
	//관리자 메인 페이지
	@RequestMapping(value="/admin", method=RequestMethod.POST)
	public String getManager(Model model,RsrvlistDTO RsrvlistDTO,Manager manager,HttpSession session) {
		int result=managerService.adminLogin(manager);
		
		session.setAttribute("adminID", manager);
		if (result==1) {
			model.addAttribute("rsrvlistDTO", managerService.getAllRsrvlistDTO());
			return "/manager/managerPage";
		}else {
			return "/manager/adminLogin";
		}
	}
	//호텔 예약 리스트
	@RequestMapping(value="/rsrvlist", method=RequestMethod.GET)
	public String getManager1(Model model) {
		model.addAttribute("rsrvlistDTO", managerService.getAllRsrvlistDTO());
			return "/manager/managerPage";
		
	}	
	//호텔 객실 현황 리스트
	@RequestMapping(value="/roomng", method=RequestMethod.GET)
	public String getManager(Model model,RoomMngDTO RoomMngDTO) {
		model.addAttribute("roomMngDTO", managerService.getAllRoomMngDTO());
		return "/manager/roomMng";
	}
	//관리자 로그인
	@RequestMapping(value="/adminLogin", method=RequestMethod.GET)
	public String managerLogin(Model model) {
		return "/manager/adminLogin";
	}
	
	//호텔 객실 가격 변경 페이지
	@RequestMapping(value="/productPriceChange")
	public String productPriceChange(Model model) {
		model.addAttribute("rooms", managerService.productPriceChange());
		return "manager/productPriceChange";
	}
	
	//호텔 객실 가격 변경
	@RequestMapping(value="/priceChangeProcess", method=RequestMethod.POST)
	public String priceChangeProcess(Room room) {
		managerDao.changePrice(room);
		return "redirect:/productPriceChange";
	}
	/*
	 * int roomPrice = managetDao.changePrice(room); log.info(room);
	 * model.addAttribute("roomPrice", roomPrice); log.info(roomPrice);
	 * 
	 * response.setContentType("text/html; charset=UTF-8"); PrintWriter out =
	 * response.getWriter();
	 * 
	 * out.println("<script>alert('금액이"+
	 * roomPrice+" 으로 수정 되었습니다.'); location.href='productPriceChange';</script>");
	 * out.flush(); out.close();
	 */
}