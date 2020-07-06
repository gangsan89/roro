package bit.camp.com.model.VO.mybatis;

import org.apache.ibatis.type.Alias;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import lombok.Data;

@Data
@Alias("reservationEdit")
@Configuration
public class ReservationEdit {
	@Bean("reservationVO")
	public ReservationEdit getReservationEdit() {
		return new ReservationEdit();
	}
	private String editState;
	
	public ReservationEdit() {}
	public ReservationEdit(String editState) {
		this.editState=editState;
	}
}
