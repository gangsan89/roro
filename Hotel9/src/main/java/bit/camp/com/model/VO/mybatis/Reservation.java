package bit.camp.com.model.VO.mybatis;

import java.sql.Date;

import org.apache.ibatis.type.Alias;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import lombok.Builder;
import lombok.Data;

@Data
@Alias("reservation")
@Configuration
public class Reservation {
	
	@Bean("reservationVO")
	public Reservation getReservation() {
		return new Reservation();
	}
	private int reservationCount;
	private Date reservationStartDate,reservationFinishDate;
	private int totalAmount, editRoute,editCode;

	
	@Autowired 
	private Customer customer;
	@Autowired 
	private Room room;
	

}
