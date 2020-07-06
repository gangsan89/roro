package com.bit.mybati.jdbcTemplate;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class UserDAOImpl extends JdbcDaoSupport implements UserDAO{


	@Override
	public List<User> fineUserList() {
		String sql = "SELECT * FROM user ";
		UserRowMapper rowMapper = new UserRowMapper();
		List<User> userList = getJdbcTemplate().query(sql, rowMapper);
		return userList;
	}

	@Override
	public User getUser(String id) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
