package bit.camp.com.model.service.room;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bit.camp.com.model.VO.room.ReservationDTO;
import bit.camp.com.model.VO.room.RoomDTO;
import bit.camp.com.model.dao.ReservationDAO;
import bit.camp.com.model.dao.RoomDAO;

@Service
public class RoomService {
	private static final Logger LOGGER = LoggerFactory.getLogger(ReservationDAO.class);

	@Autowired
	private RoomDAO roomDao;

	@Autowired
	private ReservationDAO reservationDao;

	public List<RoomDTO> getOneRoom(int roomPerson) {
		return roomDao.getOneRoom(roomPerson);
	}

	public List<RoomDTO> getAllRooms() {
		return roomDao.getAllRooms();
	}

	public int totalAmount(Date reservationStartDate, Date reservationFinishDate, int roomPrice) {
		int daysBetwen = reservationDao.daysBetwen(reservationStartDate, reservationFinishDate);
		int money = daysBetwen * roomPrice;
		return money;
	}

	public List<RoomDTO> getAvailable(ReservationDTO reservationDTO) {
		Date reservationStartDate = reservationDTO.getReservationStartDate();
		Date reservationFinishDate = reservationDTO.getReservationFinishDate();
		int roomPerson = reservationDTO.getRoomPerson();
		List<RoomDTO> AvailableRooms = new ArrayList<RoomDTO>();
		RoomDTO roomDTO = new RoomDTO();

		int days = reservationFinishDate.compareTo(reservationStartDate);
		reservationDTO.setTotalAmount(days * roomDTO.getRoomPrice());

		int countReservationsS = reservationDao.getReservationsStandart(reservationStartDate, reservationFinishDate);
		int countReservationsD = reservationDao.getReservationsDouble(reservationStartDate, reservationFinishDate);
		int countReservationsP = reservationDao.getReservationsPremium(reservationStartDate, reservationFinishDate);
		int countReservationsF = reservationDao.getReservationsFamily(reservationStartDate, reservationFinishDate);
		int countReservationsSt = reservationDao.getReservationsSuite(reservationStartDate, reservationFinishDate);

		if (countReservationsS < 10 && roomPerson <= 2) {
			AvailableRooms.addAll(roomDao.getAvailableStandart());
		}
		if (countReservationsD < 10 && roomPerson <= 3) {
			AvailableRooms.addAll(roomDao.getAvailableDouble());
		}
		if (countReservationsP < 10 && roomPerson <= 4) {
			AvailableRooms.addAll(roomDao.getAvailablePremium());
		}
		if (countReservationsF < 3 && roomPerson <= 6) {
			AvailableRooms.addAll(roomDao.getAvailableFamily());
		}
		if (countReservationsSt < 2 && roomPerson <= 10) {
			AvailableRooms.addAll(roomDao.getAvailableSuite());
		}

		return AvailableRooms;
	}

}
