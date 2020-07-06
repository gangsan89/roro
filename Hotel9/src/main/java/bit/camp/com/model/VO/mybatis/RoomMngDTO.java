package bit.camp.com.model.VO.mybatis;

import org.apache.ibatis.type.Alias;
import org.springframework.context.annotation.Configuration;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString
@Alias("roomMngDto")
@Configuration
public class RoomMngDTO {
	
	private String roomType;
	private int roomNumber;
	private String editState;
}
