package bit.camp.com.model.VO.mybatis;

import org.apache.ibatis.type.Alias;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import lombok.Data;

@Data
@Alias("room")
@Configuration
public class Room {
	
	@Bean("roomVO")
	public Room getRoom() {
		return new Room();
	}
	
	private int roomCount;
	private int roomNumber, roomPrice, roomPerson;
	private String roomPicture,roomInformation;
	private boolean reservationState;
	
	@Autowired
	private RoomTypeTable roomTypeTable;
	
}
