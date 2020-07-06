package bit.camp.com.model.VO.mybatis;

import java.sql.Date;

import org.apache.ibatis.type.Alias;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import lombok.Data;

@Configuration
@Data
@Alias("paymentMethodTable")
public class PaymentMethodTable {
	
	@Bean("paymentMethodTableVO")
	public PaymentMethodTable getPaymentMethodTable() {
		return new PaymentMethodTable();
	}
	
	private String paymentMethod,imp_uid,merchant_uid;
	private Date reservationDate;
	private int reservationCount;
	
	public PaymentMethodTable() {
		super();
	}
	public PaymentMethodTable(String paymentMethod,String imp_uid,String merchant_uid,Date reservationDate) {
		super();
		this.paymentMethod=paymentMethod;
		this.imp_uid=imp_uid;
		this.merchant_uid=merchant_uid;
		this.reservationDate=reservationDate;
	}
}
