package com.my.bit.model.dao;

import java.util.List;

import com.my.bit.model.domain.Dept;

public interface DeptDao {
	List<Dept> getAllDepts();
	Dept getDept(int deptno);
}
