package com.exam.demo;

import lombok.Data;

@Data
public class UserVO {
	public UserVO(String id, String name, String addr, boolean isFemale) {
		this.id = id;
		this.name = name;
		this.addr = addr;
		this.isFemale = isFemale;
	}
	private String id;
	private String name="이름입력";
	private String addr="주소입력";
	private boolean isFemale;
	private char gender;//f:여자, m:남자
	private int genderCode;//1,3:남자 2,4:여자
}
