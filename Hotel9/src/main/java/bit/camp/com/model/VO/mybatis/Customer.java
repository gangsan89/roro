package bit.camp.com.model.VO.mybatis;

import org.apache.ibatis.type.Alias;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString
@Alias("customer")
@Configuration
public class Customer {
	public Customer() {
		
	}
	@Bean("customerVO")
	public Customer getCustomer() {
		return new Customer();
	}
	private int customerCount;
	private String customerID,customerPW,customerName,customerPhoneNumber,sSNumber;
	
	public Customer(int customerCount,String customerID,String customerPW,String customerName,String customerPhoneNumber,String sSNumber) {
		super();
		this.customerCount=customerCount;
		this.customerID=customerID;
		this.customerPW=customerPW;
		this.customerName=customerName;
		this.customerPhoneNumber=customerPhoneNumber;
		this.sSNumber=sSNumber;
	}
}
