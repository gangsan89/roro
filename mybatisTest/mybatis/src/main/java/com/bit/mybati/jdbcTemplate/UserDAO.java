package com.bit.mybati.jdbcTemplate;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;


@Repository
public interface UserDAO {
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate);
	public List<User> fineUserList();
	public User getUser(String userId);
}
