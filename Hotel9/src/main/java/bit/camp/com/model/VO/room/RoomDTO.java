package bit.camp.com.model.VO.room;

import java.io.Serializable;
import lombok.Data;

@Data
public class RoomDTO implements Serializable {
	private static final long serialVersionUID = 212765432L;

	private int roomCount;
	private int roomNumber;
	private boolean reservationState;
	private int roomPrice;
	private int roomSalePrice;
	private String roomPicture;
	private int roomPerson;
	private int roomTypeCount;
	private String roomInformation;

}