package com.my.bit.model.domain;

import java.io.Serializable;

import lombok.Data;

@Data
public class Dept implements Serializable {
	private static final long serialVersionUID = 212765432L;
	
	private int deptno;
	private String dname;
	private String lic;
	
}
