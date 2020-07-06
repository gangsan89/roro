package com.bit.mybati.domain;


public class User {
	public User() {
		// TODO Auto-generated constructor stub
	}
	private String password;
	private String userName;
	private String userCode;
	private String userId;
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return userName;
	}
	public void setSserName(String userName) {
		this.userName = userName;
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
		return "User [password=" + password + ", name=" + userName + ", userCode=" + userCode + ", userId=" + userId + "]";
	}
	
	
}
