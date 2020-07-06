package bit.camp.com.model.VO.mybatis;

import org.apache.ibatis.type.Alias;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString
@Alias("manager")
@Configuration
public class Manager {
	
	public Manager() {
		super();
	}
	private String managerID,managerPW;
	@Bean("managerVO")
	public Manager getManager() {
		return new Manager();
	}
	public Manager(String managerID,String managerPW) {
		super();
		this.managerID=managerID;
	}
}
