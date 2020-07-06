package com.bit.mybati.model.domain;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Configuration
@Getter @Setter @ToString
public class User {
	public User() {}
	@Bean("userVO")
	public User getUser() {
		return new User();
	}
	@Builder
	public User(String userId, String userPassword, int userBirth, int userPhoneNum) {
		this.userId = userId;
		this.userPassword = userPassword;
		this.userBirth = userBirth;
		this.userPhoneNum = userPhoneNum;
	}
	
	private String userId;
	private String userPassword;
	private int userBirth;
	private int userPhoneNum;
}
