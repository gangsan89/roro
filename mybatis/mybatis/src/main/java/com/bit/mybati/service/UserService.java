package com.bit.mybati.service;

import java.util.List;

import com.bit.mybati.jdbcTemplate.User;

public interface UserService {
	public List<User> getUser(String userId);
}
