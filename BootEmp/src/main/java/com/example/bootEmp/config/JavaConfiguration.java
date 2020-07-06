package com.example.bootEmp.config;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.bootEmp.model.domain.Emp;
import com.example.bootEmp.model.domain.User;

@Configuration
//@EnableConfigurationProperties(
//{ User.class , Emp.class }
//)
public class JavaConfiguration {
	
	@Bean
	public User user() { return new User(); }
	@Bean
	public Emp emp() { return new Emp(); }
	
  
}
