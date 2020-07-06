package com.bit.mybati.model.domain;

import javax.annotation.Resource;

import org.apache.ibatis.type.Alias;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;


@Data
@Alias("dept")
@Configuration
public class Dept {
	@Bean("deptVO")
	public Dept getDept() {
		return new Dept();
	}
	
	private int deptNo;
	private String dName;
	private String loc;
	
	
	
}
