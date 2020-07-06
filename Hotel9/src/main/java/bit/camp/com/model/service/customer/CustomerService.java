package bit.camp.com.model.service.customer;

import java.util.List;

import bit.camp.com.model.VO.mybatis.Customer;
import bit.camp.com.model.VO.mybatis.Reservation;

public interface CustomerService {

	List<Customer> selectAllCustomer();// 회원목록조회

	void signUp();// 회원가입

	String login();

	String searchID();// 아이디찾기

	String searchPW();// 비번찾기

	void deleteCustomer();// 탈퇴

	int checkID();// 아이디중복체크

	int checkSSNumber();// 주민등록번호 중복체크

	/////////////////////////////////////////////////////////////////////////////////////////////////

	// 회원 마이페이지
	public Customer customerMypageView(String customerID);

	// 회원정보 수정
	public void customerModify(Customer customerVo);

	// 예약정보 확인
	public List<Reservation> customerReservation(String customerID);

}
