package com.bit.mybati.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.bit.mybati.jdbcTemplate.User;

public interface UserDAO {
	public List<User> getUser( String userId);
}
