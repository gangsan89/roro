package com.bit.mybati.jdbcTemplate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bit.mybati.service.UserService;
import com.bit.mybati.service.UserServiceImpl;
import com.bit.mybati.dao.UserDAO;

public class Test {
	
	
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/bit/mybati/config/mybatis-context.xml");
		/* UserDAOImpl impl = (UserDAOImpl)ctx.getBean("userDAO"); */
		UserDAO userDAO =  (UserDAO) ctx.getBean("mapper");
		
		System.out.println(userDAO.getUser("49022295"));
	}
}
