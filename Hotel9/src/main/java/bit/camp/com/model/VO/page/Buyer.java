package bit.camp.com.model.VO.page;


import org.springframework.context.annotation.Configuration;

import lombok.Data;

@Configuration
@Data
public class Buyer {
	
	private String pg;
	private String buyerName,buyerTel,buyerAddr,buyerEmail,buyerPostcode;
}
