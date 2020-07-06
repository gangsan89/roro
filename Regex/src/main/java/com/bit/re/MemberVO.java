package com.bit.re;

import javax.validation.constraints.Email;
import javax.validation.constraints.Pattern;


public class MemberVO {

	@Pattern(regexp = "^[A-Za-z]{1}[\\D]{7,}$")
	private String id;
	
	@Pattern(regexp = "^.{9,}$")
	private String pw;
	
	@Email()
	private String email;
	
	@Pattern(regexp = "^(01[0|1|6|7|9])-(\\d{3,4})-(\\d{4})$")
	private String phone;
	
	
	
	
//	Pattern email = Pattern.compile("^[\\w]+@[\\w]+\.[\\w]$");
//	Pattern phone = Pattern.compile("^(01[0|1|6|7|9])-(\\d{3,4})-(\\d{4})$");
}
