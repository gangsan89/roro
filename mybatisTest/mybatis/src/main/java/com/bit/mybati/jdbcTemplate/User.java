package com.bit.mybati.jdbcTemplate;

public class User {
	public User() {
		// TODO Auto-generated constructor stub
	}
	private String password;
	private String name;
	private String userCode;
	private String userId;
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserCode() {
		return userCode;
	}
	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}
	@Override
	public String toString() {
		return "User [password=" + password + ", name=" + name + ", userCode=" + userCode + ", userId=" + userId + "]";
	}
	
	
}
