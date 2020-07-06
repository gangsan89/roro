package bit.camp.com.model.VO.mybatis;

import java.sql.Date;

import org.apache.ibatis.type.Alias;
import org.springframework.context.annotation.Configuration;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString
@Alias("rsrvlistDto")
@Configuration
public class RsrvlistDTO {
	
	private int reservationCount;
	private String customerName;
	private String roomType;
	private int roomNumber;
	private Date reservationStartDate;
	private Date reservationFinishDate;
	private String editState;
}

