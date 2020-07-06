package com.example.bootEmp.model.domain;

import java.sql.Date;

import org.springframework.boot.context.properties.ConfigurationProperties;

import lombok.Getter;
import lombok.ToString;
import lombok.Setter;

@Getter @Setter @ToString
@ConfigurationProperties
public class Emp {
	private int empNo;
	private String eName;
	private String job;
	private int mgr;
	private Date hireDate;
	private double sal;
	private int deptNo;
}
