package bit.camp.com.model.service.reservation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bit.camp.com.model.VO.room.ReservationDTO;
import bit.camp.com.model.VO.room.RoomDTO;
import bit.camp.com.model.dao.ReservationDAO;

@Service
public class ReservationService {
	
	@Autowired(required=false)
	private ReservationDAO reservationDao;
	
	public void roomReservation(ReservationDTO reservationDto) {
		this.reservationDao.roomReservation(reservationDto);
	}

}