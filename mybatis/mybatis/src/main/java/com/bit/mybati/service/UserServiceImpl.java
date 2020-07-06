package com.bit.mybati.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bit.mybati.dao.UserDAO;
import com.bit.mybati.jdbcTemplate.User;

@Service
public class UserServiceImpl implements UserService{
	@Autowired
	UserDAO userDao;
	@Override
	public List<User> getUser(String userId) {
		return userDao.getUser(userId);
	}
	
}	
