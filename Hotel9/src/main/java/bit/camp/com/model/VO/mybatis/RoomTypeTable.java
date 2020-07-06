package bit.camp.com.model.VO.mybatis;

import org.apache.ibatis.type.Alias;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString
@Alias("roomTypeTable")
@Configuration
public class RoomTypeTable {
	
	@Bean("roomTypeTableVO")
	public RoomTypeTable getRoomTypeTableVO() {
		return new RoomTypeTable();
	}
	private int roomTypeCount;
	private String roomType;
	
	public RoomTypeTable() {
		super();
	}
	public RoomTypeTable(String roomType,int roomTypeCount) {
		super();
		this.roomType=roomType;
		this.roomTypeCount=roomTypeCount;
	}
}
