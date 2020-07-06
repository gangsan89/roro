package bit.camp.com.model.service.customer;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bit.camp.com.model.VO.mybatis.Customer;
import bit.camp.com.model.VO.mybatis.Reservation;
import bit.camp.com.model.dao.CustomerDao;
import bit.camp.com.model.dao.CustomerDaoImpl;

@Service("CustomerService") // 추가
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerDao customerDao;
	private SqlSessionTemplate customerSqlSession;

	// 회원목록조회
	public List<Customer> selectAllCustomer() {
		return customerDao.selectAllCustomer();
	}// 관리자

	// 회원가입
	public void signUp(Customer customer) {
		customerDao.signUp(customer);
	}

	// 아이디찾기
	public String searchID(Customer customer) {
		customerDao.searchID(customer);
		return "";
	}

	// 비밀번호찾기
	public String searchPW(Customer customer) {
		customerDao.searchPW(customer);
		return "";
	}

	// 회원탈퇴
	public void deleteCustomer(Customer customer) {
		customerDao.deleteCustomer(customer);

	}

	// 아이디중복체크
	public int checkId(String customerID) {
		customerDao = customerSqlSession.getMapper(CustomerDao.class);
		return customerDao.checkID(customerID);
	}

	// 주민등록번호 중복체크
	public int checkSSNumber(String SSNumber) {
		customerDao = customerSqlSession.getMapper(CustomerDao.class);
		return customerDao.checkSSNumber(SSNumber);
	}

	@Override
	public void signUp() {
		// TODO Auto-generated method stub

	}

	@Override
	public String searchID() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String searchPW() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteCustomer() {
		// TODO Auto-generated method stub

	}

	@Override
	public int checkID() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int checkSSNumber() {
		// TODO Auto-generated method stub
		return 0;
	}

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	// 회원 마이페이지
	@Override
	public Customer customerMypageView(String customerID) {
		return customerDao.customerMypageView(customerID);
	}

	// 회원정보수정
	@Override
	public void customerModify(Customer customerVo) {
		customerDao.customerModify(customerVo);

	}

	// 예약정보 확인
	@Override
	public List<Reservation> customerReservation(String customerID) {
		System.out.println(customerID + "컨트롤러에서 넘겨받음");
		return customerDao.customerReservation(customerID);
	}

	@Override
	public String login() {
		// TODO Auto-generated method stub
		return null;
	}

}
