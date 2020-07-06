package com.exam.demo.dao.vo;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.exam.demo.User;

@Mapper
public interface UserDao {
	List<User> selectAll();
	List<User> UserAll();
}
