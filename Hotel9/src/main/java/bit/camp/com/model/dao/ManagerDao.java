package bit.camp.com.model.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import bit.camp.com.model.VO.mybatis.Manager;
import bit.camp.com.model.VO.mybatis.Room;
import bit.camp.com.model.VO.mybatis.RoomMngDTO;
import bit.camp.com.model.VO.mybatis.RsrvlistDTO;

@Service
public interface ManagerDao {
	List<RsrvlistDTO> getAllRsrvlistDTO();

	<RsrvlistDTO> RsrvlistDTO selectRsrvlistDTO();

	List<RoomMngDTO> getAllRoomMngDTO();

	<RoomMngDTO> RoomMngDTO selectRoomMngDTO();

	int adminLogin(Manager manager);
	// List<Room> roomPrice();

	List<Room> productPriceChange();

	void changePrice(Room room);// 가격수정
}
