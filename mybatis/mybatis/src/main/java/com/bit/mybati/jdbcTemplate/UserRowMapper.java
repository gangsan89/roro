package com.bit.mybati.jdbcTemplate;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class UserRowMapper implements RowMapper<User> {
	
	@Override
	public User mapRow(ResultSet rs, int rowNum) throws SQLException {
		User user = new User();
		user.setPassword(rs.getString("USERPASSWORD"));
		user.setName(rs.getString("USERNAME")); 
		user.setUserCode(rs.getString("USERCODE"));
		user.setUserId(rs.getString("USERID"));
		return user;
	}

}
