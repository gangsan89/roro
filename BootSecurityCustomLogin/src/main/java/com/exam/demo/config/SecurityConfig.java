package com.exam.demo.config;

import java.io.IOException;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/*class MyRunnable implements Runnable{

	@Override
	public void run()  throws IOException  {
		//기초클래스가 throws를 안해서 여기선 무조건 트라이캐치를 해야한다
		System.in.read();
		
	}
	
}*/
@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	@Override
	public void configure(HttpSecurity http) throws Exception/* throws IOException */ {
		
		/* System.in.read(); */
		http
			.authorizeRequests()
				.antMatchers("/","/login").permitAll()
				.anyRequest().authenticated()
			.and()
				.formLogin()
					.loginPage("/login")
					.permitAll();
	}

}
