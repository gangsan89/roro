package com.bit.mybati.domain;

import java.util.Date;

import javax.annotation.Resource;

import org.apache.ibatis.type.Alias;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@Alias("emp")
@Configuration
@AllArgsConstructor
public class Emp {
	@Bean("empVO")
	public Emp getEmp() {
		return new Emp();
	}
	public Emp() {};
	private int empNo;
	private String eName;
	private String job;
	private int mgr;
	private Date HireDate;
	private double sal;
	private double comm;
	private int deptNo;
	
}


