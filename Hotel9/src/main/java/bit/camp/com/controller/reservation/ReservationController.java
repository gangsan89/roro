package bit.camp.com.controller.reservation;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import bit.camp.com.model.VO.room.ReservationDTO;
import bit.camp.com.model.VO.room.RoomDTO;
import bit.camp.com.model.dao.ReservationDAO;
import bit.camp.com.model.service.room.RoomService;

@Controller
public class ReservationController {
	
	@Autowired
	private RoomService roomService;
	
	@Autowired
	private ReservationDAO reservationDao;
	
	@GetMapping("/roomReservation/{roomPerson}")
	public String addReservation(@PathVariable("roomPerson") int roomPerson, ReservationDTO reservationDto, Model model) {
		List<RoomDTO> room = roomService.getOneRoom(roomPerson);
		model.addAttribute("room", room);
		return "room/roomReservation";
	}

}
