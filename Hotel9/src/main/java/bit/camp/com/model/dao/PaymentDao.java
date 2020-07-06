package bit.camp.com.model.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import bit.camp.com.model.VO.mybatis.PaymentMethodTable;
import bit.camp.com.model.VO.mybatis.Reservation;


@Service
public interface PaymentDao {
	
	void deleteReservation();
	void insertReservation(Reservation reservation);
	void insertPaymentMethod(PaymentMethodTable payment);
	int selectReservationCount();
	int selectRoomCount(Reservation reservation);
	int selectCustomerCount(Reservation reservation);
	int selectRoomTypeCount(Reservation reservation);
	List<Integer> selectRoomType(String roomType);
	List<Integer> selectRoom(Reservation reservation);
	String selectRoomTypeCode(Reservation reservation);
}
