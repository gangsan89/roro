package bit.camp.com.model.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import bit.camp.com.model.VO.mybatis.Customer;
import bit.camp.com.model.VO.mybatis.Reservation;

@Repository("CustomerDao") // 추가
public class CustomerDaoImpl implements CustomerDao {

	@Autowired
	private SqlSession sql;

	@Override
	public List<Customer> selectAllCustomer() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void signUp(Customer customer) {
		// TODO Auto-generated method stub 회원가입

	}

	@Override
	public int checkID(String customerID) {
		return 0;
		// TODO Auto-generated method stub

	}

	@Override
	public int checkSSNumber(String SSNumber) {
		return 0;
		// TODO Auto-generated method stub

	}

	@Override
	public String searchID(Customer customer) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String searchPW(Customer customer) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int deleteCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return deleteCustomer(customer);
	}

	//////////////////////////////////////////////////////////////////////////////////////////////////////////////

	// 마이페이지
	@Override
	public Customer customerMypageView(String customerID) {

		return sql.selectOne("CustomerMapper.customerMypageView", customerID);

	}

	// 개인정보 수정
	@Override
	public void customerModify(Customer customerVo) {

		sql.update("CustomerMapper.customerModify", customerVo);
	}

	// 예약정보 확인
	@Override
	public List<Reservation> customerReservation(String customerID) {
		System.out.println("DB 연결 확인");
		return sql.selectList("CustomerMapper.customerReservation", customerID);

	}

	@Override
	public String login(Customer customer) {
		// TODO Auto-generated method stub
		return null;
	}

}
