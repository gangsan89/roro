package bit.camp.com.model.dao;

import java.util.List;


import bit.camp.com.model.VO.mybatis.Customer;
import bit.camp.com.model.VO.mybatis.Reservation;

//서비스 삭제
public interface CustomerDao {

	// void insertCustomer();
	List<Customer> selectAllCustomer();// 회원목록조회
	String login(Customer customer);//로그인 이거 추가된거
	void signUp(Customer customer);// 회원가입
	int deleteCustomer(Customer customer);// 탈퇴
	
	String searchID(Customer customer);// 아이디찾기
	String searchPW(Customer customer);// 비번찾기

	int checkID(String customerID);// 아이디중복체크
	int checkSSNumber(String SSNumber);// 주민등록번호 중복체크

	/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	// 회원 마이페이지 정보
	public Customer customerMypageView(String customerID);

	// 회원정보 수정
	public void customerModify(Customer customerVo);

	// 예약정보 확인
	public List<Reservation> customerReservation(String customerID);

}
