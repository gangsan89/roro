package com.bit.hello.model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class DBConnection {
	private static final Logger logger = 
			LoggerFactory.getLogger(DBConnection.class);
	
	public final static DBConnection instance;
	private static Connection connection;
	
	private DBConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
			connection=DriverManager.getConnection(
					"jdbc:mysql://localhost/scott?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", 
					"root", "1234");
			logger.info("DBConnection()");
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	static {
		logger.info("static block");
		instance = new DBConnection();
		
	}
	
	public static Connection getConnection() {
		logger.info("DBConnection.getConnection():"+connection);
		return connection;
	}
}
