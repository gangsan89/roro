package bit.camp.com.model.service.manager;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bit.camp.com.model.VO.mybatis.Manager;
import bit.camp.com.model.VO.mybatis.Room;
import bit.camp.com.model.VO.mybatis.RoomMngDTO;
import bit.camp.com.model.VO.mybatis.RsrvlistDTO;
import bit.camp.com.model.dao.ManagerDao;

@Service("managerService")
public class ManagerServiceImpl implements ManagerService {

	@Autowired
	private ManagerDao managerDao;

	@Override
	public List<RsrvlistDTO> getAllRsrvlistDTO() {
		// TODO Auto-generated method stub
		return managerDao.getAllRsrvlistDTO();
	}

	@Override
	public RsrvlistDTO selectRsrvlistDTO() {
		// TODO Auto-generated method stub
		return managerDao.selectRsrvlistDTO();
	}

	@Override
	public int adminLogin(Manager manager) {
		return managerDao.adminLogin(manager);
	}

	/*
	 * @Override public List<Room> roomPrice() { return managerDao.roomPrice(); }
	 */

	@Override
	public List<Room> productPriceChange() {
		// TODO Auto-generated method stub
		return managerDao.productPriceChange();
	}

	@Override
	public List<RoomMngDTO> getAllRoomMngDTO() {
		// TODO Auto-generated method stub
		return managerDao.getAllRoomMngDTO();
	}

	@Override
	public RoomMngDTO selectRoomMngDTO() {
		// TODO Auto-generated method stub
		return managerDao.selectRoomMngDTO();
	}

	public void changePrice(Room room) {
		managerDao.changePrice(room);
	}

	@Override
	public void changePrice() {
		// TODO Auto-generated method stub
	}

}
