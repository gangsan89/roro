package com.bit.mybati.model.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.bit.mybati.model.domain.Dept;

@Service("deptDAO")
public interface DeptDAO {
	public List<Dept> getAllDepts();
	public Dept getDept(int deptNo);
}
