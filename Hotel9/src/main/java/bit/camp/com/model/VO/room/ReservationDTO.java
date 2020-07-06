package bit.camp.com.model.VO.room;

import java.io.Serializable;
import java.sql.Date;

import lombok.Data;

@Data
public class ReservationDTO implements Serializable {
	private static final long serialVersionUID = 212765434L;
	
	private int reservationCount;
	private Date reservationStartDate;
	private Date reservationFinishDate;
	private int totalAmount;
	private boolean checkValue;
	private int roomCount;
	private int customerCount;
	private int roomTypeCount;
	private int editRoute;
	private int editCode;
	private int roomPerson;

}
