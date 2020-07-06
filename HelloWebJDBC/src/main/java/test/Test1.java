package test;


import java.sql.Connection;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.bit.hello.model.dao.DBConnection;

public class Test1 {
	private static final Logger logger = 
			LoggerFactory.getLogger(Test1.class);
	public static void main(String[] args) {
		
		Connection conn= DBConnection.getConnection();
		System.out.println("conn=>"+conn);	
		logger.info("conn=>"+conn);
		
	}
}
