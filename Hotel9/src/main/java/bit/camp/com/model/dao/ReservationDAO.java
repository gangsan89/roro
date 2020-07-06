package bit.camp.com.model.dao;

import java.sql.Date;

import org.apache.ibatis.annotations.Param;

import bit.camp.com.model.VO.room.ReservationDTO;

public interface ReservationDAO {

	int getReservationsStandart(@Param("reservationStartDate") Date reservationStartDate,
			@Param("reservationFinishDate") Date reservationFinishDate);

	int getReservationsDouble(@Param("reservationStartDate") Date reservationStartDate,
			@Param("reservationFinishDate") Date reservationFinishDate);

	int getReservationsPremium(@Param("reservationStartDate") Date reservationStartDate,
			@Param("reservationFinishDate") Date reservationFinishDate);

	int getReservationsFamily(@Param("reservationStartDate") Date reservationStartDate,
			@Param("reservationFinishDate") Date reservationFinishDate);

	int getReservationsSuite(@Param("reservationStartDate") Date reservationStartDate,
			@Param("reservationFinishDate") Date reservationFinishDate);

	void roomReservation(ReservationDTO reservationDto);

	int daysBetwen(@Param("reservationStartDate") Date reservationStartDate,
			@Param("reservationFinishDate") Date reservationFinishDate);

}
