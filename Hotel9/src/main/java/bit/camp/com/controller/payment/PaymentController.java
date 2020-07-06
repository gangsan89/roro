package bit.camp.com.controller.payment;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;

import bit.camp.com.model.VO.mybatis.PaymentMethodTable;
import bit.camp.com.model.VO.mybatis.Reservation;
import bit.camp.com.model.VO.mybatis.Room;
import bit.camp.com.model.VO.mybatis.RoomTypeTable;
import bit.camp.com.model.VO.page.Buyer;
import bit.camp.com.model.dao.PaymentDao;
import lombok.extern.log4j.Log4j;

@Controller
@Log4j
public class PaymentController {

	@InitBinder
	public void initBinder(WebDataBinder binder) {
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
	}

	@Autowired(required = false)
	private PaymentDao paymentService;
	@Autowired
	private RoomTypeTable roomTypeTable;
	
	@RequestMapping(value = "payment.do", method = RequestMethod.POST)
	public String payment(Model model, Buyer paymentmethod, Reservation reservation, PaymentMethodTable pay){
		log.info("payment");
		String roomType=paymentService.selectRoomTypeCode(reservation);
		roomTypeTable.setRoomType(roomType);
		log.info(roomTypeTable);
		reservation.getRoom().setRoomTypeTable(roomTypeTable);
		model.addAttribute("pay", pay);
		model.addAttribute("reser", reservation);
		model.addAttribute("payment", paymentmethod);
		return "payment/payment";
	}

	@RequestMapping(value = "paychoice.do", method = { RequestMethod.POST, RequestMethod.GET })
	public String paychoice(Model model, Buyer paymentmethod, Reservation reservation) {
		model.addAttribute("reser", reservation);
		model.addAttribute("payment", paymentmethod);
		
		return "payment/payChoice";
	}

	@PostMapping(value = "paymentComplete" , produces = "application/text; charset=utf8")
	@ResponseBody
	public String payComplete(Reservation reservation,PaymentMethodTable payment) {
		reservation.getCustomer().setCustomerCount(paymentService.selectCustomerCount(reservation));
		reservation.getRoom().getRoomTypeTable().setRoomTypeCount(paymentService.selectRoomTypeCount(reservation));
		reservation.getRoom().setRoomCount(paymentService.selectRoom(reservation).get(paymentService.selectRoomCount(reservation))); 
		paymentService.insertReservation(reservation);
		payment.setReservationCount(paymentService.selectReservationCount());
		
		log.info(payment);
		
		paymentService.insertPaymentMethod(payment);
		return new Gson().toJson("성공");
	}
	@RequestMapping(value = "payCancel", method =  RequestMethod.GET )
	public String payCancel(Model model) {
		
		return "payment/payCancel";
	}

}
