package com.bit.mybati.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.bit.mybati.domain.Dept;

public interface DeptDAO {
	public List<Dept> getAllDepts();
	public Dept getDept(int deptNo);
}
