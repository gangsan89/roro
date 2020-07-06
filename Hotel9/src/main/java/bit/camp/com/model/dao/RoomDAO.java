package bit.camp.com.model.dao;

import java.util.List;

import bit.camp.com.model.VO.room.RoomDTO;

public interface RoomDAO {
	
	List<RoomDTO> getOneRoom (int roomPerson);

	List<RoomDTO> getAllRooms();

	List<RoomDTO> getAvailableStandart();

	List<RoomDTO> getAvailableDouble();

	List<RoomDTO> getAvailablePremium();

	List<RoomDTO> getAvailableFamily();

	List<RoomDTO> getAvailableSuite();

}
